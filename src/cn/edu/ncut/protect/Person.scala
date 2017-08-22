package cn.edu.ncut.protect

class Person {
  protected var name: String = "Bob"
  protected[this] var hobby: String = "game"

}
class Student extends Person {
  def sayHello = println("Hello, " + name)
  def makeFriends(s: Student) {
    //    println("my hobby is "+hobby+", your hobby is "+s.hobby )

  }

  val s1 = new Student
  val s2 = new Student
  s1.makeFriends(s2)
}

class People(val name: String, val age: Int)

class StudentX(name: String, age: Int, var score: Int) extends People(name, age) {
  def this(name: String) {
    this(name, 0, 0)
  }
  def this(age: Int) {
    this("Bob", age, 0)
  }
}