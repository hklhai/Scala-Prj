package cn.edu.ncut.obj

class Tim (val name:String)

object Tim{
  def apply(name:String)=new Tim(name)
  
  val t1 = new Tim("Tim")
  val t2 = Tim("Timmer")
}