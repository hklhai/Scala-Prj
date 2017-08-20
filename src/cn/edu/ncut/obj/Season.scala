package cn.edu.ncut.obj

object Season extends Enumeration {
  val SPRING, SUMMER, AUTUMN, WINTER = Value
}

object Session2 extends Enumeration {
  val SPRING = Value(0, "spring")
  val SUMMER = Value(1, "summer")
  val AUTUMN = Value(2, "autumn")
  val WINTER = Value(3, "winter")
  
  Session2(0)
  Session2.withName("summer")
  
  for(e <- Session2.values)
    println(e)
}