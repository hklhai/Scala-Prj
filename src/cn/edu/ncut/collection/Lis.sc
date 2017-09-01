package cn.edu.ncut.collection

import scala.collection.mutable.LinkedList

object Lis {
  val l1 = List(1, 2, 3, 4)                       //> l1  : List[Int] = List(1, 2, 3, 4)
  val l2 = List.apply(1, 2, 3, 4)                 //> l2  : List[Int] = List(1, 2, 3, 4)

  l1.head                                         //> res0: Int = 1
  l1.tail                                         //> res1: List[Int] = List(2, 3, 4)

  0 :: l2                                         //> res2: List[Int] = List(0, 1, 2, 3, 4)

  //用递归函数给List中每个元素都加上指定前缀，并打印
  def decorator(l: List[Int], prefix: String) {
    if (l != Nil) {
      println(prefix + l.head)
      decorator(l.tail, prefix)
    }
  }                                               //> decorator: (l: List[Int], prefix: String)Unit
  decorator(l2, "**")                             //> **1
                                                  //| **2
                                                  //| **3
                                                  //| **4

  /******************LinkedList********************/
  val l = LinkedList(1, 2, 3, 4)                  //> l  : scala.collection.mutable.LinkedList[Int] = LinkedList(1, 2, 3, 4)
  l.elem                                          //> res3: Int = 1
  l.next                                          //> res4: scala.collection.mutable.LinkedList[Int] = LinkedList(2, 3, 4)
  l.head                                          //> res5: Int = 1
  l.tail                                          //> res6: scala.collection.mutable.LinkedList[Int] = LinkedList(2, 3, 4)

  val list = LinkedList(1, 2, 3, 4)               //> list  : scala.collection.mutable.LinkedList[Int] = LinkedList(1, 2, 3, 4)
  var currentList = list                          //> currentList  : scala.collection.mutable.LinkedList[Int] = LinkedList(1, 2, 3
                                                  //| , 4)
  while (currentList != Nil) {
    currentList.elem *= 2
    currentList = currentList.next
  }
  
  /******************LinkedList example 2********************/
	val li = LinkedList(2,3,4,5,6,7,8)        //> li  : scala.collection.mutable.LinkedList[Int] = LinkedList(2, 3, 4, 5, 6, 7
                                                  //| , 8)
  var cList = li                                  //> cList  : scala.collection.mutable.LinkedList[Int] = LinkedList(2, 3, 4, 5, 6
                                                  //| , 7, 8)
  var first = true                                //> first  : Boolean = true
  while(cList!=Nil&&cList.next!=Nil)
  {
  	if(first)
  	{
  		cList.elem = cList.elem*2
  		first = false
  	}
  	cList = cList.next.next
  	if(cList!=Nil) cList.elem*=2
  }



}