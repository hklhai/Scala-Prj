package cn.edu.ncut.pro

import scala.collection.mutable._

object TransferArray {

  val a = Array(1, 2, 3, 4)                       //> a  : Array[Int] = Array(1, 2, 3, 4)
  val a2 = for (e <- a) yield e * e               //> a2  : Array[Int] = Array(1, 4, 9, 16)

  val b = new ArrayBuffer[Int]()                  //> b  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer()
  b += (1, 2, 3, 4)                               //> res0: cn.edu.ncut.pro.TransferArray.b.type = ArrayBuffer(1, 2, 3, 4)
  val b2 = for (e <- b) yield e * e               //> b2  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 4, 9, 16)

  val b3 = for (e <- b if (e % 2 == 0)) yield e * e
                                                  //> b3  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(4, 16)

  //函数式编程
  a.filter(_ % 2 == 0).map(_ * 2)                 //> res1: Array[Int] = Array(4, 8)
  a.filter { _ % 2 == 0 }.map { _ * 2 }           //> res2: Array[Int] = Array(4, 8)

  /*********************************************************/
  //移除第一个负数后的所有负数
  val d = new ArrayBuffer[Int]()                  //> d  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer()
  d += (1, 2, 5, -2, -5, 3, -9)                   //> res3: cn.edu.ncut.pro.TransferArray.d.type = ArrayBuffer(1, 2, 5, -2, -5, 3,
                                                  //|  -9)
  //在第一个负数之后，每发现一个负数就移除
  var isFirstNegative = false                     //> isFirstNegative  : Boolean = false
  var index = 0                                   //> index  : Int = 0
  var arrLength = d.length                        //> arrLength  : Int = 7
  while (index < arrLength) {
    if (d(index) >= 0) { index += 1 }
    else {
      if (!isFirstNegative) {
        isFirstNegative = true; index += 1
      } else {
        d.remove(index); arrLength -= 1
      }
    }
  }
  d                                               //> res4: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 2, 5, -2, 3
                                                  //| )
  /*********************************************************/
  //移除第一个负数之后的所有负数，改良版
  //记录所有不需要移除的元素索引，稍后一次性移除所有不需要的元素
  //性能较高，性能优势：数组内的元素迁移只需要进行一次
  val e = new ArrayBuffer[Int]()                  //> e  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer()
  e += (1, 2, 5, -2, -5, 3, -9)                   //> res5: cn.edu.ncut.pro.TransferArray.e.type = ArrayBuffer(1, 2, 5, -2, -5, 3
                                                  //| , -9)
  
  var foundFirstNegative= false                   //> foundFirstNegative  : Boolean = false
  val keepIndexes = for(i <- 0 until e.length if !foundFirstNegative||e(i)>=0) yield
  {
  	if(e(i)<0) foundFirstNegative = true
  	i
  }                                               //> keepIndexes  : scala.collection.immutable.IndexedSeq[Int] = Vector(0, 1, 2,
                                                  //|  3, 5)
  for(i <-0 until keepIndexes.length)
  {
  e(i)=e(keepIndexes(i))
  }
  e.trimEnd(e.length-keepIndexes.length)//移除之后元素
  e                                               //> res6: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 2, 5, -2, 
                                                  //| 3)
}