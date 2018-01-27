package Scala99

object P08 {
  def compact[T](ls: List[T]): List[T] = {
    ls match {
      case Nil => Nil
      case h :: tail => h :: compact(tail.dropWhile(h == _))
    }
  }
}
