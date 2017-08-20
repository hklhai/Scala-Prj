package cn.edu.ncut.obj

class Student {
  var name = "Alex"
}

class NStudent {
  private var nname = "Bob"
  def name = "Your name is " + nname

  def name_=(newVal: String) =
    {
      printf("Your cannot edit your name")
    }

  val leo = new NStudent
  println(leo.name)
  leo.name = "Alex"
}

class UStudent {
  private var nname = "Bob"
  def updateName(newVal: String) {
    if (newVal == "Leo") nname = newVal
    else println("Not accept this name!")
  }

  def name = "Your name is " + nname

  val s = new UStudent
  s.name
  s.updateName("Alex")
  s.updateName("Leo")
}

class TStudent {
  private var myAge = 0
  def age_=(newAge: Int) {
    if (newAge > 0) myAge = newAge
    else println("illegal age!")
  }
  def age = myAge
  def older(s: TStudent) =
    {
      myAge > s.myAge
    }
  val s1 = new TStudent
  s1.age = 20
  val s2 = new TStudent
  s2.age = 25
  s1.older(s2)
}


class CStudent {
  private[this] var myAge = 0
  def age_=(newAge: Int) {
    if (newAge > 0) myAge = newAge
    else println("illegal age!")
  }
  def age = myAge
  def older(s: CStudent) =
    {
//      myAge > s.myAge
    }
}


