package com.labs

object Lab03 {

  
  def math1(limit:Int,logic:Int=>Boolean):Set[Int] = {
	var result:Set[Int] = Set()
    for(i <- 1 to limit){
	  if(logic(i))
	    result += i
    }

	result
  }
  def math2(limit:Int,logic:Int=>Int):Set[Int] = {
    var result:Set[Int] = Set()
    for(i <- 1 to limit){
	    result += logic(i)
    }
    result -= 0
	result 
  }
  def math(limit:Int)
      (condition:Int=>Boolean)
      (process:Int=>Int = {x:Int=>x}):Set[Int] = {
    var result:Set[Int] = Set()
    for(i<-1 to limit){
      if(condition(i))
        result += process(i)
    }
    result
  }
  def main(args: Array[String]): Unit = {
    math(10) {x:Int => x%2 ==0} {x:Int => x*x}//Square of all even numbers
    
    
    
    
    
    
    //math(10, {x:Int=>x%2==0})//All even numbers
    //math(10, {x:Int=>x%2==0}, {x:Int=>x*x})//Square of all even numbers
    
    
    
    
    println(math1(10,{x:Int=>x % 2 == 0}))
    println(math1(10,{x:Int=>x % 2 != 0}))
    println(math2(20,{x:Int=>x * x }))
    println(math2(20,{x:Int=>if(x %2 != 0) x * x else 0 }))
    println(math2(20,{x:Int=>if(x %2 == 0) x * x else 0 }))
  }

}