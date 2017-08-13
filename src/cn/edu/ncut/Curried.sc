package cn.edu.ncut

object Curried {
  def currriedAdd(a: Int)(b: Int) = a + b         //> currriedAdd: (a: Int)(b: Int)Int
  currriedAdd(1)(3)                               //> res0: Int = 4

	val addOne = currriedAdd(1)_              //> addOne  : Int => Int = cn.edu.ncut.Curried$$$Lambda$8/2114694065@6debcae2
	addOne(9)                                 //> res1: Int = 10
	addOne(100)                               //> res2: Int = 101
}