import scala.collection.immutable.Seq
import scala.util.Random
import scala.actors.Actor._
import scala.actors.Actor

object ActorsExample1 {

  def checkEven(num:Int):Unit = {
    println(Thread.currentThread)
    Thread.sleep(1000)
    if(num % 2 == 0)
    		println(s"${num} is even")
    else
      println(s"${num} is not even")
  }
  
  def main(args: Array[String]): Unit = {
		  val numbers = Seq.fill(100) (Random.nextInt(1000)).toList
		  numbers.foreach {num =>
		    actor { checkEven(num) }
		  }
  }

}








