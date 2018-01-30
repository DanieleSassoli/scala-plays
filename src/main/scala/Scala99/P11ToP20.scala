package Scala99

import Scala99.P01ToP10.P10

object P11ToP20 {
  object P11 {
    def encodeModified(ls: List[String]) = {
      P10.encode(ls) map {
        case (1, elem) => elem
        case elem => elem
      }
    }
  }

  object P12 {
    def decode(ls: List[(Int, String)]) = ls.flatMap{case (times, value) => List.fill(times)(value)}
  }

  object P14 {
    def duplicate(ls: List[String], n: Int = 2): List[String] = ls.flatMap(List.fill(n)(_))
  }

  object P16 {
    def drop(i: Int, ls: List[String]): List[String] = {
      ls.zipWithIndex.collect{
        case (elem, index) if ((index + 1) % i) != 0 =>  elem
      }
    }
  }

  object P17 {
    def split[T](size:Int, ls: List[T]) = ls.splitAt(size)
  }

  object P18 {
    def slice[T](start: Int, stop: Int, ls: List[T]): List[T] =
      ls.zipWithIndex.collect{case(elem, index) if index >= start && index < stop => elem}
  }
}
