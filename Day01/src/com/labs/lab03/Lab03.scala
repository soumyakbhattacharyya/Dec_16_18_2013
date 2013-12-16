package com.labs.lab03

import scala.collection.mutable.Set

object Lab03 {

  def main(args: Array[String]): Unit = {
    val shapes:Set[Shape] = Set()
    
    var input = ""
    while(input != "q"){
      println("Please enter 's' for square, 'c' for circle, 'r' for rectangle, 'd' to display the area and 'q' to quit.")
      input = readLine()
      try{
	      if(input == "s"){
	        println("Enter the side of the square")
	        val side = readLine.toDouble
	        shapes += new Square(side)
	      }
	      else if(input == "c"){
	        println("Enter the radius of the circle")
	        val radius = readLine.toDouble
	        shapes += new Circle(radius)
	      }
	      else if(input == "r"){
	        println("Enter the length,breadth of the rectangle")
	        val lenAndBreadth = readLine()
	        val length = lenAndBreadth.split(",")(0).toDouble
	        val breadth = lenAndBreadth.split(",")(1).toDouble
	        shapes += new Rectangle(length,breadth)
	      }
	      else if(input == "d"){
	        shapes.foreach {shape => println(shape)}
	      }
      }
      catch{
        case ex:NumberFormatException => println("Invalid number: " + ex.getMessage)
        case ex:Exception => println("Error: " + ex.getMessage)
      }

    }
  }

}