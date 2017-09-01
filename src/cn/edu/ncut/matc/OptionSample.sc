package cn.edu.ncut.matc

object OptionSample {
	val grades = Map("Leo"->"A","Jack"->"B","ben"->"C")
                                                  //> grades  : scala.collection.immutable.Map[String,String] = Map(Leo -> A, Jack
                                                  //|  -> B, ben -> C)
	def getGrade(name:String)
	{
		val grade = grades.get(name)
		grade match{
		case Some(grade) => println("Your grade is "+grade)
		case None => println("Not have you Info")
		}
	}                                         //> getGrade: (name: String)Unit
	getGrade("Leo")                           //> Your grade is A
	getGrade("Jack")                          //> Your grade is B
	getGrade("ben")                           //> Your grade is C
	getGrade("Lee")                           //> Not have you Info
	
}