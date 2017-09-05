package cn.edu.ncut.implicitconversion

class SignPen {
  def write(content: String) = println(content)
}
object SignPen {
  implicit val signPen = new SignPen

  def signForExam(name: String)(implicit signPen: SignPen) {
    signPen.write(name + " welcome you arrive!")
  }
}
