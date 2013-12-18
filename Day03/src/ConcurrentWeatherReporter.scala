import scala.xml.XML
import scala.collection.mutable._
import scala.io._
import scala.actors.Actor._
import scala.actors.Actor

object TemperatureStorageActor extends Actor{
	private var temperatures:Map[String,Double] = Map()
	private var counter:Int = 0
	  
	def act(){
		while(true){
		  receive {
		    case (x:Int) => counter = x
		    case (city:String,temperature:Double) => {
		      temperatures += (city->temperature)
		      println(temperatures.size)
		      if(temperatures.size == counter) {
		        //WRITE TO DB OR FILE
		        temperatures.foreach {
		    	  item=>println(item._1 + ": " + item._2 + "deg celsius")
		    	}
		        exit();
		      }
		    }		    
		  }
		}
	}
  
}


object ConcurrentWeatherReporter {
  def loadCities(filePath:String):Map[String,String] = {
    val cities = XML.loadFile(filePath)
    val cityMap:Map[String,String] = Map()
    cities \\ "City" foreach {city => 
      cityMap += (city.\("@name").toString -> city.\("@country").toString)
     }
    cityMap
  }
  
  def getTemperature(city:String,country:String):(String,Double) = {
    val url = "http://api.openweathermap.org/data/2.5/weather?q=CITY,COUNTRY&mode=xml&units=metric"
    val output = Source.fromURL(url.replace("CITY",city).replace("COUNTRY",country)).mkString
    val response = XML.loadString(output)
    val temperature = (response \"temperature" \"@max").toString.toDouble
    (city,temperature)
  }
  
  
  def main(args: Array[String]): Unit = {
    TemperatureStorageActor.start()
    val cities = loadCities("bin/cities.xml")
    TemperatureStorageActor ! cities.size
    
    cities.foreach {item=> 
    	actor{
    			val response = getTemperature(item._1,item._2)
    			TemperatureStorageActor ! response
    	}
    	
    }
      
  }
}
