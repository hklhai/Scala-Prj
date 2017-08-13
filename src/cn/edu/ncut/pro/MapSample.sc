package cn.edu.ncut.pro

object MapSample {

  val m = Map(1 -> 2)                             //> m  : scala.collection.immutable.Map[Int,Int] = Map(1 -> 2)
  val map = Map(1 -> "Bob", 2 -> "Alex")          //> map  : scala.collection.immutable.Map[Int,String] = Map(1 -> Bob, 2 -> Alex)
                                                  //| 
  m(1)                                            //> res0: Int = 2
  map(1)                                          //> res1: String = Bob

  m.companion(1)                                  //> res2: scala.collection.immutable.Iterable[Int] = List(1)
  m.contains(2)                                   //> res3: Boolean = false

  map.keys                                        //> res4: Iterable[Int] = Set(1, 2)
  map.values                                      //> res5: Iterable[String] = MapLike.DefaultValuesIterable(Bob, Alex)

  map + (3 -> "HK")                               //> res6: scala.collection.immutable.Map[Int,String] = Map(1 -> Bob, 2 -> Alex, 
                                                  //| 3 -> HK)
  map - 1                                         //> res7: scala.collection.immutable.Map[Int,String] = Map(2 -> Alex)
  map - 2                                         //> res8: scala.collection.immutable.Map[Int,String] = Map(1 -> Bob)

  val al = map ++ List(4 -> "Le", 5 -> "LH")      //> al  : scala.collection.immutable.Map[Int,String] = Map(1 -> Bob, 2 -> Alex, 
                                                  //| 4 -> Le, 5 -> LH)
  al -- List(1, 2,4)                              //> res9: scala.collection.immutable.Map[Int,String] = Map(5 -> LH)
}