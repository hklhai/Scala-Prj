package cn.edu.ncut.matc

object CaseSample {
  class Person
  case class Student(name: String, classroom: String) extends Person
  case class Teacher(name: String, subject: String) extends Person
  case class Worker(name: String) extends Person

  def judgeIdentify(p: Person) {
    p match {
      case Student(name, classroom) => println(name + " you classroom is" + classroom)
      case Teacher(name, subject)   => println(name + " you subject is" + subject)
      case _                        => println("Illegal identify!")
    }
  }                                               //> judgeIdentify: (p: cn.edu.ncut.matc.CaseSample.Person)Unit

  val p1: Person = Student("Leo", "Class1")       //> p1  : cn.edu.ncut.matc.CaseSample.Person = Student(Leo,Class1)
  val p2: Person = Teacher("Peter", "Chinese")    //> p2  : cn.edu.ncut.matc.CaseSample.Person = Teacher(Peter,Chinese)
  val p3: Person = Worker("Alex")                 //> p3  : cn.edu.ncut.matc.CaseSample.Person = Worker(Alex)

  judgeIdentify(p1)                               //> Leo you classroom isClass1
  judgeIdentify(p2)                               //> Peter you subject isChinese
  judgeIdentify(p3)                               //> Illegal identify!
}