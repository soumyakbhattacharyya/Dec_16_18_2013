import scala.actors.Actor
import scala.actors.Actor._
import scala.actors.remote.RemoteActor._
import scala.actors.remote.Node

object ActorsExample3 {

  def main(args: Array[String]): Unit = {
    //SERVER CODE
    Server.start()
    println("Press any key to continue")
    readLine
    
   //CLIENT CODE
    val server = select(Node("localhost",9000), 'myserver)
    println(server)
    actor {server ! 10}
  }

}
object Server extends Actor{
  def act(){
    alive(9000)
    register('myserver, self)
    println("Server actor started")
    while(true){
      receive {
        case x:Int => println("Received " + x)
      }
    }
  }
}