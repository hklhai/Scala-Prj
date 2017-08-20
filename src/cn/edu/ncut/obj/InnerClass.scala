package cn.edu.ncut.obj

import scala.collection.mutable.ArrayBuffer

class InnerClass {
  class Student(var name: String) {}
  val st = new ArrayBuffer[Student]
  def getStudent(name: String) = {
    new Student(name)
  }

  val c1 = new InnerClass
  val s1 = c1.getStudent("Bob")
  c1.st += s1

  val c2 = new InnerClass
  val s2 = c2.getStudent("Alex")
//  c1.st += s2
}

