package cn.edu.ncut.trai

trait Logged {
  def log(ms:String){}
}
trait MyLogger extends Logged
{
  override def log(msg:String)
  {
    println("log:"+msg)
  }
}
class Person4(val name:String) extends Logged{
  def sayHello()
  {
    println("Hi,I'm "+name)
    log("sayHello is invoked!")
  }
}


class Test4
{
  val p1= new Person4("Bob")
  p1.sayHello()
  val p2 = new Person4("Jack") with MyLogger
  p2.sayHello()
  
}