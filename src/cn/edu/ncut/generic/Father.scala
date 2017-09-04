package cn.edu.ncut.generic

class Father(val name: String)
class Child(name: String) extends Father(name)

object X {
  def getIdCard[R >: Child](person: R) {
    if (person.getClass() == classOf[Child]) println("Child class call")
    else if (person.getClass() == classOf[Father]) println("Father class call")
    else println("Don't get ID card")
  }

  val c = new Child("alex")
  val f = new Father("father")
  getIdCard(c)
  getIdCard(f)
}
