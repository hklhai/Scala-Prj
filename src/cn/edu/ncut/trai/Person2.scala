package cn.edu.ncut.trai

trait Person2 {
  val eyeNum: Int = 2
}

class Student(val name: String) extends Person2 {
  def sayHello = println("Hi,I'm " + name + ",I have " + eyeNum + " eyes!")
}

trait SayHello {
  val msg: String
  def sayHello(name: String) = println(msg + "," + name)
}

class Person3(val name:String) extends SayHello {
  val msg: String = "hello"
  def makeFriend(p: Person3)
  {
    sayHello(p.name)
    println("I'm "+name+",I want to make friend with you!")
  }
}

class Test2 {
  val s = new Student("Alex")
  s.sayHello
  /*****************************/
  val pe1 = new Person3("Alex")
  val pe2 = new Person3("Bob")
  pe1.makeFriend(pe2)
}


