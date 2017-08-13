package cn.edu.ncut.pro

object ListSample {
  val a = List(1, 2, 3, 4)                        //> a  : List[Int] = List(1, 2, 3, 4)

  //::连接符，左边是元素，右边是List，可以将元素添加到List的头部
  val b = 0 :: a                                  //> b  : List[Int] = List(0, 1, 2, 3, 4)

  //Nil 空列表
  val c = "x" :: "y" :: "z" :: Nil                //> c  : List[String] = List(x, y, z)

  //等价连接顺序
  "z" :: Nil                                      //> res0: List[String] = List(z)
  "y" :: "z" :: Nil                               //> res1: List[String] = List(y, z)
  "x" :: "y" :: "z" :: Nil                        //> res2: List[String] = List(x, y, z)

  //::: 连接两个List
  val d = a ::: c                                 //> d  : List[Any] = List(1, 2, 3, 4, x, y, z)
  //Int 类型为值类型   String类型为引用类型，其公共类型为Any

  a.head                                          //> res3: Int = 1
  b.head                                          //> res4: Int = 0
  c.head                                          //> res5: String = x

	//返回的是尾列表
	a.tail                                    //> res6: List[Int] = List(2, 3, 4)
	b.tail                                    //> res7: List[Int] = List(1, 2, 3, 4)
	b.tail                                    //> res8: List[Int] = List(1, 2, 3, 4)
	
	//判空
	a.isEmpty                                 //> res9: Boolean = false
	Nil.isEmpty                               //> res10: Boolean = true

	def walkthrough(list:List[Int]):String={
		if(list.isEmpty) ""
		else list.head + " "+walkthrough(list.tail)
	}                                         //> walkthrough: (list: List[Int])String

	walkthrough(a)                            //> res11: String = "1 2 3 4 "

}