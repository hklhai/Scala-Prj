package cn.edu.ncut.trai

trait Hello {
  def sayHello(name: String)
}

trait Makefriend {
  def makeFriend(p: Person)
}
class Person(val name: String) extends Hello with Makefriend {
  def sayHello(uName: String) = println("Hello, " + uName + ", My name is " + name)
  def makeFriend(p: Person) = println("Hello," + p.name + " ,My name is " + name)
}

class Test {
  val p1 = new Person("Leo")
  val p2 = new Person("Bob")
  
  p1.sayHello("Alex")
  p1.makeFriend(p2)
  
  
  val peo1 = new People("alex")
  val peo2 = new People("alex")
  peo1.makeFriend(peo2)
}


trait Logger{
  def log(message:String)=println(message)
}

class People(val name:String) extends Logger
{
  def makeFriend(p:People)
  {
    println("Hi , I'm"+name+"I'm glad to make firend with you "+p.name)
    log("makeFriend method is invoke with parameter People[name="+p.name+"]")
  }
}

