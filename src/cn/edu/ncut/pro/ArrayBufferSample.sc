package cn.edu.ncut.pro

import scala.collection.mutable.ArrayBuffer

object ArrayBufferSample {
  //使用insert在指定位置插入元素
  var a = new ArrayBuffer[Int]()                  //> a  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer()
  a += (1, 2)                                     //> res0: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 2)
  a.insert(2, 7, 8)
  a                                               //> res1: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 2, 7, 8)

  a.insert(4, 10)
  a                                               //> res2: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 2, 7, 8, 10
                                                  //| )

  //移除元素
  a.remove(1,3)
  a                                               //> res3: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 10)
  
  //Array与Arraybuffer可以相互转换
  val  b = new Array[Int](5)                      //> b  : Array[Int] = Array(0, 0, 0, 0, 0)
  a.toArray                                       //> res4: Array[Int] = Array(1, 10)
  b.toBuffer                                      //> res5: scala.collection.mutable.Buffer[Int] = ArrayBuffer(0, 0, 0, 0, 0)
  
  
  
}