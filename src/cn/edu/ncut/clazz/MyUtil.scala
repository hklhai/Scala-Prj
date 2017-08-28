package cn.edu.ncut.clazz

class MyUtil {
  def printMessage(msg: String) = println(msg)
}

trait Logger extends MyUtil {
  def log(msg: String) = printMessage("log:" + msg)
}

class Person(val name: String) extends Logger {
  def sayHello {
    log("Hi,I'm" + name)
    printMessage("Hi,I'm" + name)
  }
}
