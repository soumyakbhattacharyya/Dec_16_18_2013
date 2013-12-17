object PatternMatching2 {
  def processBonus(pro:SoftwareProfessional):Double = {
    pro match {
      case Developer("Sam",salary) => salary * 0.12
      case Developer(name,salary) => salary * 0.10
      case Tester(name,salary) => salary * 0.12
      case Architect(name,salary) => {
        if(salary > 100000 && salary < 100000)
        	salary * 0.8
        else
            salary * 0.7
      }
      case Architect(name,1200000) => 1200000 * 0.2
    }
  }
  def main(args: Array[String]): Unit = {}

}
abstract class SoftwareProfessional
case class Developer(name:String,salary:Double) extends SoftwareProfessional
case class Tester(name:String,salary:Double) extends SoftwareProfessional
case class Architect(name:String,salary:Double) extends SoftwareProfessional