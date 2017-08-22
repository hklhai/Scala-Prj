package cn.edu.ncut.overridefield

class Person {
  val name: String = "Person"
  def age: Int = 0
}

class Student extends Person {
  override val name: String = "Leo"
  override val age: Int = 30

  /***************************/
  val s = new Student
  s.name
  s.age
  /***************************/

  val p: Person = new Student
  var s1: Student = null
  if (p.isInstanceOf[Student]) s1 = p.asInstanceOf[Student]
  /***************************/

  val per: Person = new Student
  per.isInstanceOf[Person]
  per.isInstanceOf[Student]
  per.getClass == classOf[Person]
  per.getClass == classOf[Student]
  /***************************/
  val person:Person = new Student
  
  person match{
    case per:Person => println("It's Person's obejct")
    case _=>println("unknown type")
  }
}