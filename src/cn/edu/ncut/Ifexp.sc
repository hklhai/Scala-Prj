package cn.edu.ncut

object Ifexp {
  if (true) 1 else 2                              //> res0: Int = 1
  if (false) 3 else 4                             //> res1: Int = 4

  val a = 1                                       //> a  : Int = 1
  if (a == 1) a                                   //> res2: AnyVal = 1
  if (a != 1) "not one"                           //> res3: Any = ()
  if (a != 1) "not one" else a                    //> res4: Any = 1

  //for
  val l = List("Jack", "Bob", "Alex")             //> l  : List[String] = List(Jack, Bob, Alex)

  for (
    s <- l
  ) println(s)                                    //> Jack
                                                  //| Bob
                                                  //| Alex
  
  for{
  s<-l
  if(s.length()>3)
  }println(s)                                     //> Jack
                                                  //| Alex
  
  val res = for{
  s<-l
  s1 = s.toUpperCase()
  if(""!=s1)
  }yield(s1)                                      //> res  : List[String] = List(JACK, BOB, ALEX)

}