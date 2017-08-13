package cn.edu.ncut.pro

import scala.collection.mutable.ArrayBuffer

object ArraySample {
  val a = new Array[Int](5)                       //> a  : Array[Int] = Array(0, 0, 0, 0, 0)
  val b = new Array[String](3)                    //> b  : Array[String] = Array(null, null, null)

  a(3) = 2
  a                                               //> res0: Array[Int] = Array(0, 0, 0, 2, 0)
  a(3)                                            //> res1: Int = 2

  val s = Array("Alex", "Person")                 //> s  : Array[String] = Array(Alex, Person)
  s(1)                                            //> res2: String = Person

  a.length                                        //> res3: Int = 5
  /********************ArrayBuffer*****************************/
  ArrayBuffer                                     //> res4: scala.collection.mutable.ArrayBuffer.type = scala.collection.mutable.A
                                                  //| rrayBuffer$@17f6480
  Array                                           //> res5: Array.type = scala.Array$@96532d6
	//创建空的ArrayBuffer
	val arr = new ArrayBuffer[Int]()          //> arr  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer()
	//放元素到ArrayBuffer是采用+= ,Spark源码中大量使用了该种操作语法
	arr+=1                                    //> res6: cn.edu.ncut.pro.ArraySample.arr.type = ArrayBuffer(1)
	arr+=(3,5,8)                              //> res7: cn.edu.ncut.pro.ArraySample.arr.type = ArrayBuffer(1, 3, 5, 8)
	
	//加入其它集合中的元素++=
	arr++=Array(22,33)                        //> res8: cn.edu.ncut.pro.ArraySample.arr.type = ArrayBuffer(1, 3, 5, 8, 22, 33)
                                                  //| 
	//trimEnd()，可以从尾部截断指定个数的元素
	arr.trimEnd(3)
	arr                                       //> res9: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 3, 5)
}