package cn.edu.ncut.inner

class Person(protected val name: String) {
  def sayHello = "Hello,I'm " + name

  val p = new Person("Bob") {
    override def sayHello = "Hello,My name is " + name
  }
  def greeting(p:Person{def sayHello:String})
  {
    println(p.sayHello)
  }

}