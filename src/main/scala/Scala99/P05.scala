package Scala99

object P05 extends {
  def reverseRecursive(ls: List[Int]): List[Int] = {
    ls match {
      case Nil => Nil
      case h :: tail => reverseRecursive(tail) ::: List(h)
    }
  }

  def reverse[T](ls: List[T]): List[T] = ls.reverse
}
