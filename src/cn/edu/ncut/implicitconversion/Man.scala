package cn.edu.ncut.implicitconversion

class Man(val name: String)
class SuperMan(val name: String) {
  def emitLaser = println("emit a laser!")
}

object X {
  implicit def man2SuperMan(man: Man): SuperMan = new SuperMan(man.name)

  val ocean = new Man("ocean")
  ocean.emitLaser
}