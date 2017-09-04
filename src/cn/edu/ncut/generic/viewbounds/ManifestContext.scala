package cn.edu.ncut.generic.viewbounds

class ManifestContext {
  def packageFood[T: Manifest](food: T*) =
    {
      val foodPackage = new Array[T](food.length)
      for (i <- 0 until food.length) foodPackage(i) = food(i)
      foodPackage
    }
}

class Meat(val name: String)
class Vegetable(val name: String)



object O {
  val t1 = new Meat("meat-1")
  val t2 = new Meat("meat-2")
  val t3 = new Meat("meat-3")

//  val p1 = packageFood(t1, t2, t3)

  val v1 = new Vegetable("vegetable-1")
  val v2 = new Vegetable("vegetable-2")
  val v3 = new Vegetable("vegetable-3")
//  val p2 = packageFood(v1, v2, v3)

}