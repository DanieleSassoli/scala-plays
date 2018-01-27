package Scala99

object P09 {
  def pack[T](ls: List[T]): List[List[T]] = {
    ls match {
      case Nil => Nil
      case _ =>
        val (packed, next) = ls span { _ == ls.head}
        packed :: pack(next)
    }
  }
}
