package cn.edu.ncut.extend

class Person {
  private var name = "Bob"
  def getName = name
}

class Student extends Person {
  private var score = "A"
  def getScore = score
}

class Person1 {
  var name = "Bob"
}

class Student1 extends Person1{}