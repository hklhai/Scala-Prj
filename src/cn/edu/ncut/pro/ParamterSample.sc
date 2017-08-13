package cn.edu.ncut.pro

object ParamterSample {
  def sum(nums: Int*) = {
    var sum = 0
    for (num <- nums)
      sum += num
    sum
  }                                               //> sum: (nums: Int*)Int
  sum(0, 2)                                       //> res0: Int = 2
  sum(1, 2, 3)                                    //> res1: Int = 6




	sum(1 to 5: _*)                           //> res2: Int = 15
	
  def sum2(nums: Int*): Int = {
    if (nums.length == 0) 0
    else nums.head + sum2(nums.tail: _*)
  }                                               //> sum2: (nums: Int*)Int

	sum2(2,3,4)                               //> res3: Int = 9
	sum2(1,2,3)                               //> res4: Int = 6
}