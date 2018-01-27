package Scala99

object P10 {
  def encode[T](ls: List[T]): List[(Int, T)] = {
    ls match {
      case Nil => Nil
      case _ =>
        val (packed, next) = ls span { _ == ls.head}
        (packed.length, packed.head) :: encode(next)
    }
  }

  def encodeWithP09[T](ls: List[T]): List[(Int, T)] = {
    P09.pack(ls) map { e => (e.length, e.head)}
  }
}
