package cn.edu.ncut.pro

object TupleSample {

  val a = List(1, 2, 3)                           //> a  : List[Int] = List(1, 2, 3)

  val tp1 = (1, 2)                                //> tp1  : (Int, Int) = (1,2)
  1 -> 2                                          //> res0: (Int, Int) = (1,2)
  
  val tp2 = 1 -> 2                                //> tp2  : (Int, Int) = (1,2)
  val t3 = (1, "Alice", "Math", 95.5)             //> t3  : (Int, String, String, Double) = (1,Alice,Math,95.5)

  t3._1                                           //> res1: Int = 1
  t3._2                                           //> res2: String = Alice
  t3._3                                           //> res3: String = Math
  t3._4                                           //> res4: Double = 95.5
 
  def sumSq(in: List[Int]): (Int, Double, Double) =
    in.foldLeft(0, 0d, 0d)((t, v) => (t._1 + 1, t._2 + v, t._3 + v * v))
                                                  //> sumSq: (in: List[Int])(Int, Double, Double)
  sumSq(a)                                        //> res5: (Int, Double, Double) = (3,6.0,14.0)
}