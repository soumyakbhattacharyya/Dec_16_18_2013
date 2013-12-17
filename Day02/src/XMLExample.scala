import scala.util.parsing.json.JSON

object XMLExample {
  def getPopulation = "1.2 billion"
    
  def main(args: Array[String]): Unit = {
    //val obj:JSON = new JSON({"name":"value"})
    
	val name = "India"
    val countries = <Countries>
			<Country population={getPopulation}>{name}</Country>
			<Country population="50 million">USA</Country>
    	</Countries>
	println(countries.getClass)
		val countriesMap = countries \\ "Country"
		countriesMap.foreach {item=>println(item.text)}
		
		
		println(countries.\\("Country")(0).text)
		println(countries.\\("Country")(0).\("@population"))
  }
}