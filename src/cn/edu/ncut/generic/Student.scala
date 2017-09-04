package cn.edu.ncut.generic

class Student[T](val localled: T) {
  def getSchool(loc: T) = "S-" + loc + "-" + localled
}

object S {

  val s = new Student[Int](100)
  s.getSchool(22)
  val s1 = new Student[String]("bj")
  s1.getSchool("sh")
  //类型推断
  val s2 = new Student("hh")
  s2.getSchool("xixi")

  /*****************泛型函数***************/
  def getCard[T](context: T) {
    if (context.isInstanceOf[Int]) println("card Int:" + context)
    else if (context.isInstanceOf[String]) println("card String:" + context)
    else println("card :" + context)
  }

  getCard[Int](10)
  getCard[String]("xx")

  getCard(20)
  getCard("ss")

}