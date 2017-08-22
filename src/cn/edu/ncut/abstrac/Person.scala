package cn.edu.ncut.abstrac

abstract class Person(val name: String) {
  def sayHello: Unit
}

class Student(name: String) extends Person(name) {
  def sayHello: Unit = println("Hello, " + name)
}