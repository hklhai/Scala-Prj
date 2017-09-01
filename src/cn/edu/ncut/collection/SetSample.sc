package cn.edu.ncut.collection

import scala.collection.mutable.HashSet
import scala.collection.mutable.LinkedHashSet
import scala.collection.mutable.SortedSet

object SetSample {
  val s1 = Set(1, 2, 3); s1 + 1; s1 + 4;
  s1

  val s = HashSet[Int]()
  s += 1
  s += 2
  s += 5
  s

  val sl = LinkedHashSet[Int]()
  sl += 1
  sl += 2
  sl += 5
  sl
  
  /***********/
  val ss = SortedSet("oragne","apple","red")
}