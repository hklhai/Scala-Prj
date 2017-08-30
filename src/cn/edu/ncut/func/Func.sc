package cn.edu.ncut.func

object Func {
  def sayHello(name: String) = println("Hello," + name)
  val sayHelloFunc = sayHello _
  sayHelloFunc("Alex")

  /*************匿名函数**************/
  val sayH = (name: String) => println("hello," + name)
  sayH("Bob")
  /*************高阶函数**************/
  val sayHell = (name: String) => println("hello," + name)
  def greeting(func: (String) => Unit, name: String) { func(name) } //返回Unit和name
  greeting(sayHell, "Alex")

  //Array的Map也是高阶函数
  Array(1, 2, 3, 4).map((num: Int) => num * num)

  //高阶函数的另一个功能就是将函数作为返回值
  //传入msg，返回值为参数为name的函数
  def getGreeting(msg: String) = (name: String) => println(msg + "," + name)
  //调用getGreeting传入msg,返回函数
  val greetingFunc = getGreeting("Hello")
  //传入name参数
  greetingFunc("Bob")
  /*************Currying**************/
  def sum(a: Int, b: Int) = a + b
  sum(1, 1)

  //返回接收原来第二个参数的第二个函数
  def sum2(a: Int) = (b: Int) => a + b
  sum2(1)(1)

  def sum3(a: Int)(b: Int) = a + b
  sum3(1)(1)
  /*************return**************/

  def greeting(name: String) = {
    def sayHello(name: String): String = {
      return "Hello," + name
    }
    sayHello(name)
  }
  greeting("ALex")

}