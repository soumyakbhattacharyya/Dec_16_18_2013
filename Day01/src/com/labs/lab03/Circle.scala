package com.labs.lab03

class Circle(val radius:Double) extends Shape{
	def area:Double = 3.14 * radius * radius
	override def toString :String = 
	  	s"Area of circle with radius ${radius} is ${area}"
}