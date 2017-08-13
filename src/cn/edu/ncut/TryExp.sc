package cn.edu.ncut

object TryExp {

  try {
    Integer.parseInt("haha");
  } catch {
    case _ => 0 //_通配符，无论是什么异常都可以匹配
  } finally {
    println("always exe")
  }                                               //> always exe
                                                  //| res0: Int = 0

  val code = 2                                    //> code  : Int = 2
  code match {
    case 1 => "one"
    case 2 => "two"
    case 3 => "three"
    case _ => "other"
  }                                               //> res1: String = two
}