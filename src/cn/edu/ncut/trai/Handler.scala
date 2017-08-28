package cn.edu.ncut.trai

trait Handler {
  def handle(data: String) {}
}

trait DataValidHandler extends Handler {
  override def handle(data: String) {
    println("check data:" + data)
    super.handle(data)
  }
}

trait SigatureValidHandler extends Handler {
  override def handle(data: String) {
    println("chech signature:" + data)
    super.handle(data)
  }
}

class Person5(val name: String) extends SigatureValidHandler with DataValidHandler {
  def sayHello = {
    (println("Hello," + name))
    handle(name)  
  }
}

class Test5{
  val p5=new Person5("Alex")
  p5.sayHello
  
  
}

