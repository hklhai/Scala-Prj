package cn.edu.ncut.prodefine

trait SayHello {
  val msg: String
  println(msg.toString())
}

//1
class Person
/*
  val p=new {
  val msg:String="init"}with Person with SayHello


//2
class Person extends{
  val msg:String="init"
}with SayHello{}
*/


/*
trait SayHello {
  lazy val msg: String = null
  println(msg.toString())
}

//报错
class Person extends SayHello {}
*/

/*
trait SayHello {
  lazy val msg: String = null
  println(msg.toString())
}
class Person extends SayHello {
  override lazy val msg: String = "init"
}
*/
