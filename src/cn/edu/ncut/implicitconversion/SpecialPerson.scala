package cn.edu.ncut.implicitconversion

import scala.language.implicitConversions

class SpecialPerson(val name: String)
class Student(val name: String)
class Older(val name: String)

class Teacher(val name: String)

object U {
  implicit def object2SpecialPerson(obj: Object): SpecialPerson = {
    if (obj.getClass == classOf[Student]) {
      val stu = obj.asInstanceOf[Student]
      new SpecialPerson(stu.name)
    } else if (obj.getClass == classOf[Older]) {
      val older = obj.asInstanceOf[Older]
      new SpecialPerson(older.name)
    } else Nil
  }

  var tickNum = 0
  def buySpecialticket(p: SpecialPerson) = {
    tickNum += 1
    "T-" + tickNum
  }

  val t = new Teacher("Leo")
  buySpecialticket(t)

  val s = new Student("Ocean")
  val o = new Older("Alex")
  buySpecialticket(s)
  buySpecialticket(o)
}

class TicketHouse {
  var tickNum = 0
  def buySpecailTicket(p: SpecialPerson) {
    tickNum += 1
    "T-" + tickNum
  }
}

object TicketHouse {
  val s = new Student("Ocean")

  val t = new TicketHouse
//    t.buySpecailTicket(s)

}



