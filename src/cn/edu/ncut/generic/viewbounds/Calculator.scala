package cn.edu.ncut.generic.viewbounds

class Calculator[T:Ordering](val number1:T,val number2:T) {
  def max(implicit order :Ordering[T]) = if(order.compare(number1, number2)>0) number1 else number2
}

object R{
  val c = new Calculator(10,7)
  c.max
}