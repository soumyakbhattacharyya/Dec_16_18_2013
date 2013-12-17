package com.labs

import scala.xml.Elem

class BookStore {
  private val books = Map(
      "309-483-480"->("Spring 3.0 Black Book",699),
      "310-483-480"->("Programming in Scala",1200),
      "311-483-480"->("Practical Ext JS 4",1800),
      "313-483-480"->("Programming Groovy",2800))
  def getBooks = {
    books.map {book =>
      				val isbn = book._1
      				val title = book._2._1
      				val price = book._2._2
      				<Book isbn={isbn}>
    						<Title>{title}</Title>
    						<Price>{price}</Price>
    				</Book>
    			}
  }    
  def toXML:Elem = <Catalog>{getBooks}</Catalog>
}
object Lab02 {

  def main(args: Array[String]): Unit = {
    println(new BookStore toXML)
  }

}