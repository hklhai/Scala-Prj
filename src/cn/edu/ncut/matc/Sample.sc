package cn.edu.ncut.matc

object Sample {
  def judgeGrade(grade: String) {
    grade match {
      case "A" => println("Excellent")
      case "B" => println("Good")
      case "C" => println("Just so so")
      case _   => println("You need work hard")
    }
  }                                               //> judgeGrade: (grade: String)Unit

  judgeGrade("A")                                 //> Excellent
  judgeGrade("C")                                 //> Just so so
  judgeGrade("E")                                 //> You need work hard

  /********************模式匹配中使用if守卫***********************************/
  def judgeGrade2(grade: String, name: String) {
    grade match {
      case "A"                 => println(name + ",Excellent")
      case "B"                 => println(name + ",Good")
      case "C"                 => println(name + ",Just so so")
      case _ if name == "Alex" => println(name + ",You good boy")
      case _                   => println(name + ",Just so so")
    }
  }                                               //> judgeGrade2: (grade: String, name: String)Unit

  judgeGrade2("A", "Lee")                         //> Lee,Excellent
  judgeGrade2("C", "Alex")                        //> Alex,Just so so
  judgeGrade2("zx", "Alex")                       //> Alex,You good boy
  judgeGrade2("W", "Wei")                         //> Wei,Just so so
  /********************模式匹配中进行变量赋值***********************************/
  def judgeGrade3(grade: String, name: String) {
    grade match {
      case "A"                      => println(name + ",Excellent,you got A grade")
      case "B"                      => println(name + ",Good,you got B grade")
      case "C"                      => println(name + ",Just so so,you got C grade")
      case _grade if name == "Alex" => println(name + ",You good boy,you grade is " + _grade)
      case _grade                   => println(name + ",Just so so,you grade is " + _grade)
    }
  }                                               //> judgeGrade3: (grade: String, name: String)Unit
  judgeGrade3("A", "Lee")                         //> Lee,Excellent,you got A grade
  judgeGrade3("C", "Alex")                        //> Alex,Just so so,you got C grade
  judgeGrade3("zx", "Alex")                       //> Alex,You good boy,you grade is zx
  judgeGrade3("W", "Wei")                         //> Wei,Just so so,you grade is W
}