object AccessingJava {

  def main(args: Array[String]): Unit = {
    val cls = new AJavaClass
    cls.setName("From Scala")
    println(cls.getName)
  }

}