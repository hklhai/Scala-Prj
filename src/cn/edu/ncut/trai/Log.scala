package cn.edu.ncut.trai

trait Log {
  def log(msg: String)
}

trait MyLog extends Log {
  abstract override def log(msg: String) { super.log(msg) }
}