package cn.edu.ncut

object ComputeValue {
  def test1(x: Int, y: Int): Int = x * x          //> test1: (x: Int, y: Int)Int
  def test2(a: => Int,b: => Int):Int=a*a          //> test2: (a: => Int, b: => Int)Int

  test1(3 + 4, 8)                                 //> res0: Int = 49
  //test1(7,8)
  //7*7
  //49

  test2(3+4,8)                                    //> res1: Int = 49
  //(3+4)(3+4)
  //7*(3+4)
  //7*7

  test1(7, 2 * 4)                                 //> res2: Int = 49
  //test1(7,8)
  //7*7
  //49

  test2(7,2*4)                                    //> res3: Int = 49
  //7*7
  //49
  
  /******************************/
  def bar(x:Int,y: => Int)=1                      //> bar: (x: Int, y: => Int)Int
  
  def loop():Int = loop                           //> loop: ()Int

	bar(1,loop)                               //> res4: Int = 1

	//bar(loop,1)   //死循环
}