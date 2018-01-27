package Scala99

object P07 {
  def flatten(ls: List[Any]): List[Any] = {
    ls.flatMap {
      _ match {
        case elem: List[Any] => flatten(elem)
        case elem: Any => List(elem)
      }
    }
  }
}
