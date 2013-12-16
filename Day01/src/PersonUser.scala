object PersonUser {

  def main(args: Array[String]): Unit = {
    val p1 = new Person("Sam",32)
    println(p1.work(10))
    p1.gender = "Female"
    println(p1.gender)
    //p1.name = "Ram"
    p1.age = 33
    println(p1.age)
    println(p1.name)
  }

}