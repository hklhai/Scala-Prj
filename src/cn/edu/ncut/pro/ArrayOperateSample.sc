package cn.edu.ncut.pro

import scala.util.Sorting._
import scala.collection.mutable._

object ArrayOperateSample {

  var a = Array(2, 3, 4, 5, 6)                    //> a  : Array[Int] = Array(2, 3, 4, 5, 6)

  val sum = a.sum                                 //> sum  : Int = 20

  val max = a.max                                 //> max  : Int = 6

  val min = a.min                                 //> min  : Int = 2
  
  
  var b = Array(5, 3, 1, 8, 6)                    //> b  : Array[Int] = Array(5, 3, 1, 8, 6)
	quickSort(b)
	b                                         //> res0: Array[Int] = Array(1, 3, 5, 6, 8)


	b.mkString                                //> res1: String = 13568
	b.mkString(",")                           //> res2: String = 1,3,5,6,8
	b.mkString("[", ",", "]")                 //> res3: String = [1,3,5,6,8]
	
	b.toString                                //> res4: String = [I@380fb434
	
	val c = new ArrayBuffer[Int]()            //> c  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer()
	c +=(2,3,4,5)                             //> res5: cn.edu.ncut.pro.ArrayOperateSample.c.type = ArrayBuffer(2, 3, 4, 5)
	c.toString()                              //> res6: String = ArrayBuffer(2, 3, 4, 5)
}