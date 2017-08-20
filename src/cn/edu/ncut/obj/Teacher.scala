package cn.edu.ncut.obj

object Teacher {
  private val eyeNum = 2
  def getEyeNum = eyeNum
}

class Teacher(val name: String, val age: Int) {
  def sayHello = println("Hi," + name + ",age is " + age+"you have"+Teacher.eyeNum+"eye")

  val t = new Teacher("Alex",28)
  t.sayHello
} 





