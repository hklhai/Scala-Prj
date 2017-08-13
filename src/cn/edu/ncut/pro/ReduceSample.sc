package cn.edu.ncut.pro

object ReduceSample {
  val a = List(1, 2, 3, 4)                        //> a  : List[Int] = List(1, 2, 3, 4)

  a.reduceLeft((x, y) => x + y)                   //> res0: Int = 10
  a.reduceLeft(_ + _)                             //> res1: Int = 10

  a.foldLeft(0)(_ + _)                            //> res2: Int = 10
  a.foldLeft(1)(_ * _)                            //> res3: Int = 24

  1 to 10                                         //> res4: scala.collection.immutable.Range.Inclusive = Range 1 to 10

  1 to 10 by 2                                    //> res5: scala.collection.immutable.Range = inexact Range 1 to 10 by 2

  (1 to 10).toList                                //> res6: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

  1 until 10                                      //> res7: scala.collection.immutable.Range = Range 1 until 10
  //to上界闭区间，until下界开区间

  /*****************Stream***************/
  
	//Stream连接操作符#::,第一个值永远提前确定，其余值使用到才会求值
  val s = 1 #:: 2#:: 3#:: Stream.empty            //> s  : scala.collection.immutable.Stream[Int] = Stream(1, ?)

	val stream = (1 to 1000000).toStream      //> stream  : scala.collection.immutable.Stream[Int] = Stream(1, ?)
	
	stream.head                               //> res8: Int = 1
	
	stream.tail                               //> res9: scala.collection.immutable.Stream[Int] = Stream(2, ?)
	 /*****************Stream***************/
	
	
}