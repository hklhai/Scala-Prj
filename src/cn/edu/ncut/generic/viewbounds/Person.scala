package cn.edu.ncut.generic.viewbounds

import scala.language.implicitConversions
class Person(val name: String) {
  def sayHello = println("hello,I'm " + name)
  def makeFriend(p: Person) {
    sayHello
    p.sayHello
  }
}

class Student(name: String) extends Person(name)
class Dog(val name: String) { def sayHello = println("Wang!Wang!I'm " + name) }
class Party[T <% Person](p1: T, p2: T)

object YY {
  implicit def dog2Person(obj: Object): Person = {
    if (obj.isInstanceOf[Dog]) { val _dog = obj.asInstanceOf[Dog]; new Person(_dog.name) }
    else Nil
  }

  val s1 = new Student("Alex")
  val d1 = new Dog("Lee")
  val t = new Party(s1, d1)
}

