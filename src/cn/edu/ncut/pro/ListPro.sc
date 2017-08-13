package cn.edu.ncut.pro

object ListPro {
  val a = List(1, 2, 3, 4)                        //> a  : List[Int] = List(1, 2, 3, 4)

  //表达式成立 保留元素，filter中为匿名函数
  a.filter(x => x % 2 == 1)                       //> res0: List[Int] = List(1, 3)

  val b = "ni hao HK 88".toList                   //> b  : List[Char] = List(n, i,  , h, a, o,  , H, K,  , 8, 8)
  b.filter(p => Character.isDigit(p))             //> res1: List[Char] = List(8, 8)

  //takeWhile 满足条件继续取值，不满足则退出
  b.takeWhile(p => p != 'H')                      //> res2: List[Char] = List(n, i,  , h, a, o,  )

  /**********************************map***********************************/
  val c = "x" :: "y" :: "z" :: Nil                //> c  : List[String] = List(x, y, z)

  //x代表c中每一个成员
  c.map(x => x.toUpperCase())                     //> res3: List[String] = List(X, Y, Z)

  //x代表c中每一个成员,_用于统配
  c.map(_.toUpperCase())                          //> res4: List[String] = List(X, Y, Z)

  a.filter(_ % 2 == 1)                            //> res5: List[Int] = List(1, 3)

  a.filter(_ % 2 == 1).map(_ + 10)                //> res6: List[Int] = List(11, 13)

  val q = List(List(1, 2), List(4, 5, 6))         //> q  : List[List[Int]] = List(List(1, 2), List(4, 5, 6))
  //取出所有偶数

	//map返回值与之前结合类型一样
  q.map(x => x.filter(_ % 2 == 0))                //> res7: List[List[Int]] = List(List(2), List(4, 6))
  q.map(_.filter(_ % 2 == 0))                     //> res8: List[List[Int]] = List(List(2), List(4, 6))

	//flatMap会转换成一层
	q.flatMap(_.filter(_ % 2 == 0))           //> res9: List[Int] = List(2, 4, 6)

}