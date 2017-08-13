package cn.edu.ncut.pro

import scala.collection.mutable.ArrayBuffer

object TravelArray {
  //使用for与until遍历Array/Arraybuffer
  //until是RichInt提供函数
  var a = new ArrayBuffer[Int]()                  //> a  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer()
  a += (1, 2)                                     //> res0: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 2)
  a.insert(2, 7, 8)

  for (i <- 0 until a.length) println(a(i))       //> 1
                                                  //| 2
                                                  //| 7
                                                  //| 8
  //跳跃遍历Array/Arraybuffer
  for (i <- 0 until (a.length, 2)) println(a(i))  //> 1
                                                  //| 7

  //反转遍历Array/Arraybuffer
  for (i <- (0 until a.length).reverse) println(a(i))
                                                  //> 8
                                                  //| 7
                                                  //| 2
                                                  //| 1
  //使用增强For循环遍历Array/Arraybuffer
  for(i <- a) println(i)                          //> 1
                                                  //| 2
                                                  //| 7
                                                  //| 8
}