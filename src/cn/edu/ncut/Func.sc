package cn.edu.ncut

object Func {

  def hello(name: String): String = {
    s"nihao ${name}"
  }                                               //> hello: (name: String)String

  hello("wangwu")                                 //> res0: String = nihao wangwu

  def helloV2(name: String) = {
    s"nihao ${name}"
  }                                               //> helloV2: (name: String)String

  helloV2("zhaoliu")                              //> res1: String = nihao zhaoliu

  def add(x: Int, y: Int) = {
    x + y
  }                                               //> add: (x: Int, y: Int)Int

  add(1, 2)                                       //> res2: Int = 3

  // 花括号就是代码块，只有一个表达式的代码块花括号可以被省略
  def add2(x: Int, y: Int) = x + y                //> add2: (x: Int, y: Int)Int

  add2(2, 3)                                      //> res3: Int = 5
  
  
  
  /*********************************/
  def operate(f:(Int,Int) => Int) ={   //将f(4,4)的返回值作为operate的返回值
  f(4,4)
  }                                               //> operate: (f: (Int, Int) => Int)Int
  
  
  def greeting() =(name:String) => {"hello"+" "+name}
                                                  //> greeting: ()String => String


	def a=(x:Int,y:Int) => x+y                //> a: => (Int, Int) => Int
  a(1,2)                                          //> res4: Int = 3
}