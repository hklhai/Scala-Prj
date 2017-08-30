package cn.edu.ncut.func

object HighFunc {
  /*************高阶函数的类型推断**************/
  def greeting(func: (String) => Unit, name: String) { func(name) }
                                                  //> greeting: (func: String => Unit, name: String)Unit
  greeting((name: String) => println("Hello," + name), "Alex")
                                                  //> Hello,Alex
  //支持类型推断
  greeting((name) => println("Hello," + name), "Alex")
                                                  //> Hello,Alex
  //只有一个参数可以去掉小括号
  greeting(name => println("Hello," + name), "Alex")
                                                  //> Hello,Alex
  //仅有的一个参数在右侧的函数体内只使用一次，则还可以将接收参数省略，并且将参数用_来替代
  def triple(f: Int => Int) = { f(3) }            //> triple: (f: Int => Int)Int
  triple(3 * _)                                   //> res0: Int = 9

  /*************Scala的常用高阶函数**************/
  Array(1, 2, 3).map(2 * _)                       //> res1: Array[Int] = Array(2, 4, 6)

  //foreach：会对每个传入的元素都进行处理，但是没有返回值
  (1 to 9).map("*" * _).foreach(println _)        //> *
                                                  //| **
                                                  //| ***
                                                  //| ****
                                                  //| *****
                                                  //| ******
                                                  //| *******
                                                  //| ********
                                                  //| *********
  //filter:对传入的每个元素都进行条件判断，如果对元素返回true，则保留该元素；否则过滤掉该元素
  (1 to 20).filter(_ % 2 == 0)                    //> res2: scala.collection.immutable.IndexedSeq[Int] = Vector(2, 4, 6, 8, 10, 12
                                                  //| , 14, 16, 18, 20)
  //reduceLeft:从左侧元素开始，进行reduce操作，即先对元素1和元素2进行处理，然后将结果与元素3处理，
  //再将结果与元素4处理，依次类推，即为reduce.如下例子相当于1*2*3...*8*9
  (1 to 9).reduceLeft(_ * _)                      //> res3: Int = 362880

  //sortWith：对元素进行两两相比，进行排序
  Array(2, 4, 3, 10, 1).sortWith(_ < _)           //> res4: Array[Int] = Array(1, 2, 3, 4, 10)
  /*************闭包**************/
  def getGreeting(msg: String) = (name: String) => println(msg + "," + name)
                                                  //> getGreeting: (msg: String)String => Unit
  //会创建不同的函数对象，保留不同的msg
  val sayHello = getGreeting("Hello")             //> sayHello  : String => Unit = cn.edu.ncut.func.HighFunc$$$Lambda$27/12867832
                                                  //| 32@6fb554cc
  val sayHi = getGreeting("Hi")                   //> sayHi  : String => Unit = cn.edu.ncut.func.HighFunc$$$Lambda$27/1286783232@
                                                  //| 614c5515
  sayHello("Alex")                                //> Hello,Alex
  sayHi("Alex")                                   //> Hi,Alex
}