trait Dream{
  def sleep = println("Sleeping all the time")
}
trait Hunger{
  def eat = println("Feel like eating all the time")
}
trait CraveForMoney {
  def needMoreMoney = println("Give me more")
}
trait NightWatchman  {
  def sleep = println("Feeling sleepy all the time")
}
abstract class Human
class Developer2
object Traits {
  def main(args: Array[String]): Unit = {
    val worker2:CraveForMoney = new Worker("Sam")
//    worker2.eat
    
    val dev2 = new Developer2
    			with NightWatchman
    			with Hunger
    
    val dev1 = new Developer2
    			with Hunger
    			with CraveForMoney
    			with Dream
    			//with NightWatchman
        			
    //val hunger1 = new Hunger
	val worker1 = new Worker("Ram")
	worker1.eat
	worker1.sleep
	worker1.needMoreMoney
  }
}

class Worker(val name:String) 
	extends Human
	with CraveForMoney
	with Hunger
	with Dream{
  
}
