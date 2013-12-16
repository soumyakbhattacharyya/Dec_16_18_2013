package com.labs

import scala.util.Random

object Lab01 {
   
  def playGame2(attempts:Int,target:Int):Unit = {
      val guess = readLine.toInt
      if(guess > target){
        println("Aim Lower")
        playGame2(attempts+1,target)
      }
      else if(guess < target){
        println("Aim Higher")
        playGame2(attempts+1,target)
      }
      else if(guess == target){
        println(s"You have got it in ${attempts+1} attempts")
      }
    }
	def playGame1 = {
	   println("Enter a number between 1 and 100")
	    val target = new Random().nextInt(100)
	    var guess  = -1
	    var attempts = 0
	    while(guess != target){
	      guess = readLine.toInt
	      attempts += 1
	      if(guess < target)
	        println("Aim Higher")
	      else if(guess > target)
	         println("Aim Lower")
	      else if(guess == target)
	        println(s"You have got it in ${attempts} attempts")
	    }
	 }
  def main(args: Array[String]): Unit = {
	  //playGame2(attempts,target)
      playGame2(0,new Random().nextInt(100))
      //playGame1
  }

}





