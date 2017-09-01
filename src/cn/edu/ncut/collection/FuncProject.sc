package cn.edu.ncut.collection

import scala.io.Source

object FuncProject {
  //map函数式编程：为List中每个元素都添加一个前缀
  List("Lee", "Alex", "Ocean", "Wei").map("name is" + _)
                                                  //> res0: List[String] = List(name isLee, name isAlex, name isOcean, name isWei)
                                                  //| 
  //faltMap函数式编程：将List中的多行句子拆分成单词
  List("Hello World", "You Me").flatMap(_.split(" "))
                                                  //> res1: List[String] = List(Hello, World, You, Me)
  //foreach函数式编程：打印List中的每个单词
  List("I", "have", "beautiful", "house").foreach(println(_))
                                                  //> I
                                                  //| have
                                                  //| beautiful
                                                  //| house
                                               

  //zip函数式编程：对学生姓名和学生成绩进行关联
  List("Lee", "Alex", "Ocean", "Wei").zip(List(100, 98, 78, 88))
                                                  //> res2: List[(String, Int)] = List((Lee,100), (Alex,98), (Ocean,78), (Wei,88))
                                                  //| 

  /******************Sample******************/
	val l1 = Source.fromFile("D://1.txt").mkString
                                                  //> l1  : String = hello lee
	val l2 = Source.fromFile("D://2.txt").mkString
                                                  //> l2  : String = hello alex ocean peter
  val line = List(l1,l2)                          //> line  : List[String] = List(hello lee, hello alex ocean peter)
  
  line.flatMap(_.split(" ")).map((_,1)).map(_._2).reduceLeft(_ + _)
                                                  //> res3: Int = 6
}