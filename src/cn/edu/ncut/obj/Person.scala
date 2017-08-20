package cn.edu.ncut.obj

import scala.beans.BeanProperty

class Person {
  @BeanProperty var name: String = _
}

class People(@BeanProperty var name: String)

class Alex() {
  private var name = ""
  private var age = 0

  def this(newName: String) {
    this()
    name = newName
  }

  def this(newName: String, newAge: Int) {
    this(newName)
    age = newAge
  }
}

class Bob(val name: String, val age: Int) {
  println("name is " + name + "age is" + age)
}

//主Constructor中还可以通过使用默认，参数，来给参数默认值
class Leo(val name: String = "Leo", val age: Int = 27) {
  println("name is " + name + "age is" + age)
}

//如果住Constructor传入的参数什么修饰都没有，比如name:String，name如果类内部的方法使用到了，则会声明为private[this] name;
//否则没有该field，就只能被Contructor代码使用而已



