package com.labs.lab03

class Rectangle(val length:Double,val breadth:Double) extends Shape{
	 def area:Double = length * breadth
	override def toString :String = 
	  	s"Area of Rectangle with len ${length} and breadth ${breadth} is ${area}"
}