package cn.edu.ncut.generic.viewbounds

class Master
class Professional extends Master
class Card[+T](val name: String)

object Y {
  def enterMeet(card: Card[Master]) {
    println("welcome to meeting!")
  }

  val m = new Card[Master]("Ocean")
  val p = new Card[Professional]("Lee")
  enterMeet(m)
  enterMeet(p)
}

class PCard[-T](val name: String)

object X {
  def enterMeeting(card: PCard[Professional]) {
    println("welcome to meeting!")
  }
  val m1 = new PCard[Master]("Ocean")
  val p1 = new PCard[Professional]("Lee")
  enterMeeting(p1)
  enterMeeting(m1)
}

