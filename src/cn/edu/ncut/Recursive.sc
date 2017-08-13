package cn.edu.ncut

object Recursive {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  //@annotation.tailrec
  def fact(n: Int, m: Int): Int = {
    if (n < 0) m
    else fact(n - 1, m*n)
  }                                               //> fact: (n: Int, m: Int)Int

  val a=fact(2, 1)                                //> a  : Int = 0
  
  

}