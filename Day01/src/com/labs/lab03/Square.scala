package com.labs.lab03

class Square(val side:Double) extends Shape {
	 def area:Double = side*side
	override def toString :String = 
	  	s"Area of square with side ${side} is ${area}"
}