package cn.edu.ncut.pro

object Sample {
  def sum(n: Int) = {
    var sum = 0
    for (i <- 1 to n)
      sum += i
    sum
  }                                               //> sum: (n: Int)Int

  sum(100)                                        //> res0: Int = 5050

  //斐波那契
  def fab(n: Int): Int = {
    if (n <= 1) 1
    else fab(n - 1) + fab(n - 2)
  }                                               //> fab: (n: Int)Int

  fab(3)                                          //> res1: Int = 3

  /****************************************/
  def sayHello(firstName: String, middleName: String = "H", lastName: String = "K"): String = {
    "name is" + firstName + middleName + lastName
  }                                               //> sayHello: (firstName: String, middleName: String, lastName: String)String

  sayHello("UU")                                  //> res2: String = name isUUHK

  sayHello(firstName = "haha", middleName = "nihao", lastName = "xixi")
                                                  //> res3: String = name ishahanihaoxixi

  sayHello("haha", middleName = "nihao", lastName = "xixi")
                                                  //> res4: String = name ishahanihaoxixi
                                                  

}