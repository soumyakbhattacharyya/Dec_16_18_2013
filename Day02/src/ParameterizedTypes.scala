class MyStore[T]{
  
  private var collection:List[T] = Nil

}

object ParameterizedTypes {

  def confuse[A,B,C,D,E,F](list1:List[A],
      list2:List[B],
      list3:List[C],
      list4:List[D],
      list5:List[E]):Unit = {

  }
  
  def mergeMapsIntoList[K,V,T](map1:Map[K,V],map2:Map[K,V],lst:List[T]) = {
    
  }
  
  def mergeMaps[K,V](map1:Map[K,V],map2:Map[K,V]) = {
    
  }
  
  
  def printAnotherMap[K,V](limit:Int,mp:Map[K,V]) = {
	  mp.keys.foreach {key => println(key)}
  }
  
  
  def printMaps[K,V](mp:Map[K,V]) = {
	  mp.keys.foreach {key => println(key)}
  }
  def printCollection[T](lst:List[T]) = {
    lst.foreach {item => println(item)}
  }
  
  def main(args: Array[String]): Unit = {
    printMaps(Map("A"->1,"B"->2))
    
    printCollection(List("A","V","C"))
    
    printCollection(List(1,2,3,4))
  }

}