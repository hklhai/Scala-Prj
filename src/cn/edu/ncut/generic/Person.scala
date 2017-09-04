package cn.edu.ncut.generic

class Person(val name: String) {
  def sayHello = println("Hello,I'm" + name)
  def makeFriends(p: Person) {
    sayHello
    p.sayHello
  }
}
class Stu(name: String) extends Person(name)
class Party[T <: Person](p1: T, p2: T) {
  def play = p1.makeFriends(p2)
}

object TestDemo {
  val p1 = new Stu("Leo")
  val p2 = new Stu("Tom")
  val party = new Party(p1,p2)
  party.play
}