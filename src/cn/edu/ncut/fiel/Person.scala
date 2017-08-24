package cn.edu.ncut.fiel

abstract class Person {
  val name: String
}
class Student extends Person {
  val name: String = "Leo"
}