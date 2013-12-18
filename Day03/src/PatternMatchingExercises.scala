object PatternMatchingExercises {
	def reverse(lst:List[Char]):List[Char] = {
	    lst match {
	      case List('#') => throw new Exception("Illegal list")
	      case Nil => Nil
	      case first :: rest => reverse(rest) ::: List(first)
	    }
   }
}