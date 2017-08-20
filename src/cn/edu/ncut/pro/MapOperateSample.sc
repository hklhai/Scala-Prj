package cn.edu.ncut.pro

object MapOperateSample {

  val map = scala.collection.mutable.Map("Alex" -> 23, "Person" -> 25, "Ocean" -> 27)
                                                  //> map  : scala.collection.mutable.Map[String,Int] = Map(Ocean -> 27, Person ->
                                                  //|  25, Alex -> 23)
  map("Alex") = 33
  map                                             //> res0: scala.collection.mutable.Map[String,Int] = Map(Ocean -> 27, Person -> 
                                                  //| 25, Alex -> 33)

  //map 中添加多个元素
  map += ("Bob" -> 34, "Lee" -> 39)               //> res1: cn.edu.ncut.pro.MapOperateSample.map.type = Map(Ocean -> 27, Person ->
                                                  //|  25, Bob -> 34, Alex -> 33, Lee -> 39)
  //map 中一个或多个移除元素
  map -= "Alex"                                   //> res2: cn.edu.ncut.pro.MapOperateSample.map.type = Map(Ocean -> 27, Person ->
                                                  //|  25, Bob -> 34, Lee -> 39)
  map -= ("Person", "Lee")                        //> res3: cn.edu.ncut.pro.MapOperateSample.map.type = Map(Ocean -> 27, Bob -> 34
                                                  //| )
  /**********************************遍历Map*********************************/
  //遍历Map的entrySet
  for ((key, value) <- map) println(key + ":" + value)
                                                  //> Ocean:27
                                                  //| Bob:34
  //遍历map的key
  for (key <- map.keySet) println(key)            //> Ocean
                                                  //| Bob
  //遍历map的value
  for (value <- map.values) println(value)        //> 27
                                                  //| 34
  //生成新Map，反转key和value，注意value相同的情况
  for ((key, value) <- map) yield (value, map)    //> res4: scala.collection.mutable.Map[Int,scala.collection.mutable.Map[String,I
                                                  //| nt]] = Map(34 -> Map(Ocean -> 27, Bob -> 34), 27 -> Map(Ocean -> 27, Bob -> 
                                                  //| 34))
  /****************************SortedMap和LinkedHashMap*********************/
  //自动的按照key进行排序
  val sm = scala.collection.mutable.SortedMap("Leo" -> 23, "Ocean" -> 27, "Bob" -> 65, "Alex" -> 34)
                                                  //> sm  : scala.collection.mutable.SortedMap[String,Int] = TreeMap(Alex -> 34, B
                                                  //| ob -> 65, Leo -> 23, Ocean -> 27)
  val shm = scala.collection.mutable.HashMap("Leo" -> 23, "Ocean" -> 27, "Bob" -> 65, "Alex" -> 34)
                                                  //> shm  : scala.collection.mutable.HashMap[String,Int] = Map(Ocean -> 27, Bob -
                                                  //| > 65, Alex -> 34, Leo -> 23)
  val slhm = scala.collection.mutable.LinkedHashMap("Leo" -> 23, "Ocean" -> 27, "Bob" -> 65, "Alex" -> 34)
                                                  //> slhm  : scala.collection.mutable.LinkedHashMap[String,Int] = Map(Leo -> 23,
                                                  //|  Ocean -> 27, Bob -> 65, Alex -> 34)
  /*************************************Tuple******************************/
	val t = ("Leo",28)                        //> t  : (String, Int) = (Leo,28)
	t._1                                      //> res5: String = Leo
	t._2                                      //> res6: Int = 28
	
	//zip
	val name = Array("Alex","Bob","Peter")    //> name  : Array[String] = Array(Alex, Bob, Peter)
	val age = Array(22,34,19)                 //> age  : Array[Int] = Array(22, 34, 19)
	val nameAge = name.zip(age)               //> nameAge  : Array[(String, Int)] = Array((Alex,22), (Bob,34), (Peter,19))
	
	for((name,age)<-nameAge)
		println(name+":"+age)             //> Alex:22
                                                  //| Bob:34
                                                  //| Peter:19

}