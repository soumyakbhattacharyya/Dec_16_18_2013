package com.labs

class Account2(val accountNumber:Long,var balance:Double){
  private var fname:String = ""
  private var lname:String = ""
  
  def firstName:String = {
    fname
  }
  def lastName = lname
  
  def this(theFirstName:String,theLastName:String,accNum:Long,bal:Double){
    this(accNum,bal)
    this.fname = theFirstName
    this.lname = theLastName
  }
}


object Lab012 {
  def main(args: Array[String]): Unit = {}
}