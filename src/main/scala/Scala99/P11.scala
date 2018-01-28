package Scala99

object P11 {
  def encodeModified(ls: List[String]) = {
    P10.encode(ls) map {
      case (1, elem) => elem
      case elem => elem
    }
  }
}
