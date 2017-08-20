package cn.edu.ncut.pro


object MapTupleSample {
  //创建一个不可变得Map
  val m = Map("Alex" -> 23, "Person" -> 25, "Ocean" -> 27)
                                                  //> m  : scala.collection.immutable.Map[String,Int] = Map(Alex -> 23, Person -> 
                                                  //| 25, Ocean -> 27)
	
	//m("Alex")=33
	
	val map = scala.collection.mutable.Map("Alex" -> 23, "Person" -> 25, "Ocean" -> 27)
                                                  //> map  : scala.collection.mutable.Map[String,Int] = Map(Ocean -> 27, Person ->
                                                  //|  25, Alex -> 23)
	map("Alex")=33
	
	map                                       //> res0: scala.collection.mutable.Map[String,Int] = Map(Ocean -> 27, Person -> 
                                                  //| 25, Alex -> 33)
                                                  
  val m1 = Map(("Alex",33),("Person",29),("Ocean",27))
                                                  //> m1  : scala.collection.immutable.Map[String,Int] = Map(Alex -> 33, Person ->
                                                  //|  29, Ocean -> 27)
                                                  
  val voidMap = new scala.collection.mutable.HashMap[String,Int]
                                                  //> voidMap  : scala.collection.mutable.HashMap[String,Int] = Map()
   /***********************************************************/
   //获取指定key对应的value，如果key不存在就会报错
   m1("Alex")                                     //> res1: Int = 33
  // m1("alex")
	
	val mv = if(m1.contains("alex")) m1("alex") else 0
                                                  //> mv  : Int = 0

	val getOr = m1.getOrElse("alex", 0)       //> getOr  : Int = 0

}