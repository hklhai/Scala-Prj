package cn.edu.ncut.basic

import scala.util.control.Breaks._

object IFSample {
  val a = 30                                      //> a  : Int = 30
  if (a > 18) 1 else 0                            //> res0: Int = 1
  val x = if (a > 18) 1 else 0                    //> x  : Int = 1

  var auidtAge = -1                               //> auidtAge  : Int = -1
  if (a > 18) auidtAge = 1 else auidtAge = 0
  auidtAge                                        //> res1: Int = 1

  if (a > 10) 1 else "xx"                         //> res2: Any = 1

  if (a < 1) 1                                    //> res3: AnyVal = ()
  if (a < 1) 1 else ()                            //> res4: AnyVal = ()

  var m, n = 2                                    //> m  : Int = 2
                                                  //| n  : Int = 2
  val d = if (m > 1) { m = m + 1; n = n + 1; m + n }
                                                  //> d  : AnyVal = 6

  /***************while do**********/

  var w = 3                                       //> w  : Int = 3
  while (w > 0) {
    println(w)
    w -= 1
  }                                               //> 3
                                                  //| 2
                                                  //| 1
  /***************for**********/
  var u = 3                                       //> u  : Int = 3
	for(i <- 0 to u) println(i)               //> 0
                                                  //| 1
                                                  //| 2
                                                  //| 3
  for(i <- 0 until u) println(i)                  //> 0
                                                  //| 1
                                                  //| 2
                                                  
	for(i <- "Hello World") print(i+" ")      //> H e l l o   W o r l d 

	breakable {
		var m = 10
		for(c <- "Hello World")
		{
			if(m==5) break;
			println(c)
		  m -= 1
		}
	}                                         //> H
                                                  //| e
                                                  //| l
                                                  //| l
                                                  //| o
}