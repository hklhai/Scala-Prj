package cn.edu.ncut.trai

class Person7 {println("Person7's Constructor")}
trait Logger7 {println("Logger7's Constructor")}
trait MyLogger7 extends Logger7{println("MyLogger7's Constructor")}
trait TimerLogger7 extends Logger7{println("TimerLogger7's Constructor")}
class Student7 extends Person7 with MyLogger7 with TimerLogger7{
  println("Student7's Constructor")
}