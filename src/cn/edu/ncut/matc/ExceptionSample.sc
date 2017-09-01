package cn.edu.ncut.matc

import java.io.FileNotFoundException
import java.io.IOException

object ExceptionSample {
  def processException(e: Exception) {
    e match {
      case e1: IllegalArgumentException => println("The Exception is " + e1)
      case e2: FileNotFoundException    => println("The Exception is " + e2)
      case e3: IOException              => println("The Exception is " + e3)
      case _: Exception                 => println("Don't konw the  Exception!")
    }
  }                                               //> processException: (e: Exception)Unit
  processException(new IllegalArgumentException("This is IllegalArgumentException"))
                                                  //> The Exception is java.lang.IllegalArgumentException: This is IllegalArgument
                                                  //| Exception
  processException(new FileNotFoundException("This is FileNotFoundException"))
                                                  //> The Exception is java.io.FileNotFoundException: This is FileNotFoundExceptio
                                                  //| n
  processException(new IOException("This is IOException"))
                                                  //> The Exception is java.io.IOException: This is IOException
  processException(new Exception("This is Exception"))
                                                  //> Don't konw the  Exception!
  /**********************对Array 的元素进行模式匹配*************************/
  def greeting1(arr: Array[String]) {
    arr match {
      case Array("Leo")               => println("Hi,Leo")
      case Array(grid1, grid2, grid3) => println("Hi " + grid1 + grid2 + grid3)
      case Array("Leo", _*)           => println("Hi,please introduce your friend")
      case _                          => println("hey,who are you?")
    }
  }                                               //> greeting1: (arr: Array[String])Unit
  greeting1(Array("Leo"))                         //> Hi,Leo
  greeting1(Array("Leo","Ocean"))                 //> Hi,please introduce your friend
  greeting1(Array("Lee","Lp","WW"))               //> Hi LeeLpWW
  greeting1(Array("Alex"))                        //> hey,who are you?
  
  
  /**********************对 List 的元素进行模式匹配*************************/
  def greeting2(list: List[String]) {
    list match {
      case "Leo" :: Nil                   => println("Hi,Leo")
      case grid1 :: grid2 :: grid3 :: Nil => println("Hi " + grid1 + grid2 + grid3)
      case "Leo" :: tail                  => println("Hi,please introduce your friend")
      case _                              => println("hey,who are you?")
    }
  }                                               //> greeting2: (list: List[String])Unit
  
  greeting2(List("Leo"))                          //> Hi,Leo
  greeting2(List("XX ","YY ","ZZ "))              //> Hi XX YY ZZ 
  greeting2(List("Leo","XX"))                     //> Hi,please introduce your friend
  greeting2(List("LeoX"))                         //> hey,who are you?
}