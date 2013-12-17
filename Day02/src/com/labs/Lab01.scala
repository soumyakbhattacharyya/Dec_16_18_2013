package com.labs

class SavingsAccount(override val firstName:String,
    override val lastName:String,
    override val accountNumber:Long) 
    	extends Account(firstName,lastName,accountNumber,10000){
  
  override def withdraw(amount:Double):Unit = {
		  super.withdraw(amount)
		  if(amount > 5000)
			  super.withdraw(amount + (amount * 0.01))
  }
}
class Account(val firstName:String,
		val lastName:String,
		val accountNumber:Long,
		var balance:Double){
  def deposit(amount:Double):Unit = {
    balance += amount
  }
  def withdraw(amount:Double):Unit = {
    balance -= amount
  }
}

object Lab01 {
  def main(args: Array[String]): Unit = {}
}