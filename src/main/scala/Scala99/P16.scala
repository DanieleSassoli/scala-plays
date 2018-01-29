package Scala99

object P16 {
  def drop(i: Int, ls: List[String]): List[String] = {
    ls.zipWithIndex.collect{
      case (elem, index) if ((index + 1) % i) != 0 =>  elem
    }
  }
}
