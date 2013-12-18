import scala.xml.XML
import scala.collection.mutable._
import scala.io._

object WeatherReporter {
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
    println(s"${city} : ${temperature} celsius")
    (city,temperature)
  }
  var temperatures:Map[String,Double] = Map()
  
  def storeOutput(city:String,temperature:Double) = {
    	temperatures += (city->temperature)
  }
  def main(args: Array[String]): Unit = {
    val cities = loadCities("bin/cities.xml")
    
    cities.foreach {item=> 
    	val (city,temperature) = getTemperature(item._1,item._2)
    	storeOutput(city,temperature)
    }
    
      
      
      
      
      
      
  }

}
import scala.collection.mutable.Map