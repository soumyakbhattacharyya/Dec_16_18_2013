class Person(val name:String,var age:Int) {
	var gender:String = "Male"
    
	def work(hours:Int):String = {
	  s"${name} works ${hours} hours a day"
	}
}