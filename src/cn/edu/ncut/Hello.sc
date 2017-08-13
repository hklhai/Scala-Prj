package cn.edu.ncut

object Hello {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  val ua = 10                                     //> ua  : Int = 10

  var ux = 0                                      //> ux  : Int = 0

  /*********************************1**********************************************/
  val x = 10                                      //> x  : Int = 10

  val y = 20                                      //> y  : Int = 20

  val z = x + y                                   //> z  : Int = 30

  lazy val u = x * y                              //> u: => Int = <lazy>

  val uval = u * 10                               //> uval  : Int = 2000
  /*********************************2**********************************************/
  val a: Byte = 10                                //> a  : Byte = 10

  val b: Short = 20                               //> b  : Short = 20

  val c: Int = 30                                 //> c  : Int = 30

  val d: Long = 40                                //> d  : Long = 40

  val e: Float = 50                               //> e  : Float = 50.0

  val f: Double = 60.897                          //> f  : Double = 60.897

  val ax: Long = b                                //> ax  : Long = 20

  //val bx :Int = d

  val m = true                                    //> m  : Boolean = true

  val n = false                                   //> n  : Boolean = false

  val q = 'Q'                                     //> q  : Char = Q

  val uu: Unit = ()                               //> uu  : Unit = ()

  val uq = ()                                     //> uq  : Unit = ()

  def foo = throw new Exception("Error")          //> foo: => Nothing

  //String 新增字符串插值（interpolation）
  val p = "XX"                                    //> p  : String = XX
  s"ni hao ${p}"                                  //> res0: String = ni hao XX
}