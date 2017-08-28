package cn.edu.ncut.trai

trait Valid {
  def getName:String
  def vaild:Boolean={getName=="Leo"}
}

class Person6(val name:String) extends Valid
{
  println(vaild)
  def getName=name
}

class X{
  
  val v=new Person6("Leo")
  val a= new Person6("Alex")
  
}