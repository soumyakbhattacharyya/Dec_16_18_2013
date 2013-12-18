import scala.collection.immutable.Seq
import scala.util.Random
import scala.actors.Actor._
import scala.actors.Actor

object EvenActor extends Actor{
  def act(){
      println("**Waiting**")
	  while(true){
	    receive {
	      case msg:String => println(msg)
	      case _ => { println("Error"); exit() }
	    }
	  }
  }
}

object ActorsExample2 {

  def checkEven(num:Int):String = {
    Thread.sleep(1000)
    if(num % 2 == 0)
    		s"${num} is even"
    else
      s"${num} is not even"
  }
  
  def main(args: Array[String]): Unit = {
		  val numbers = Seq.fill(100) (Random.nextInt(1000)).toList
		  EvenActor.start()
		  numbers.foreach {num =>
		    actor { EvenActor ! checkEven(num) }
		  }
  }

}








