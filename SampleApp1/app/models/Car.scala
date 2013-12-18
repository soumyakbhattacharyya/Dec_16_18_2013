package models

case class Car(model:String,year:Int,color:String) {

}
object Car{
  var cars = Set(
      Car("Micra",2011,"Red"),
      Car("BMW",2010,"Black"),
      Car("Audi",2013,"White"),
      Car("Verna",2012,"Brown"),
      Car("City",2014,"Silver"))
      
  def findAll = cars.toList.sortBy(_.year)
}