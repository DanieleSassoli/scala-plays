package Scala99

import P01ToP10.P10

object P11 {
  def encodeModified(ls: List[String]) = {
    P10.encode(ls) map {
      case (1, elem) => elem
      case elem => elem
    }
  }
}
