package cn.edu.ncut.extend


class People {
  private var name = "Bob"
  def getName = name
}

class StudentX extends People {
  private var score = "A"
  def getScore=score
  override def getName = "I'm "+super.getName
}