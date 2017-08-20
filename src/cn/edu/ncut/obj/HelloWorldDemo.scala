package cn.edu.ncut.obj

class HelloWorldDemo {
  private var name = "Bob"
  //定义时有()，调用时可以加也可以不加
  def sayHello() { println("Hello" + name) }
  //如果定义函数没有括号，在外部调用时也不可以加括号，直接调用即可
  def getName = name
}


class Im {
  
  val helloWorldDemo = new HelloWorldDemo
  helloWorldDemo.sayHello
  helloWorldDemo.sayHello()
  println(helloWorldDemo.getName)
}