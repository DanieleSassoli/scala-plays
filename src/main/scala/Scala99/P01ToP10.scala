package Scala99

import scala.util.{Failure, Success, Try}

object P01ToP10 {

  object P01 {
    def last(ls: List[Int]): Int = ls.last
  }

  object P02 {
    def penultimate(ls: List[Int]): Int = ls.init.last
  }

  object P03 {
    def kth(i: Int, ls: List[Int]): Either[Throwable, Int] = Try(ls(i)) match {
      case Success(elem) => Right(elem)
      case Failure(t) => Left(t)
    }
  }

  object P05 {
    def reverseRecursive(ls: List[Int]): List[Int] = {
      ls match {
        case Nil => Nil
        case h :: tail => reverseRecursive(tail) ::: List(h)
      }
    }

    def reverse[T](ls: List[T]): List[T] = ls.reverse
  }

  object P06 {
    def isPalindrome[T](ls: List[T]): Boolean = ls == P05.reverse(ls)
  }

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

  object P08 {
    def compact[T](ls: List[T]): List[T] = {
      ls match {
        case Nil => Nil
        case h :: tail => h :: compact(tail.dropWhile(h == _))
      }
    }
  }

  object P09 {
    def pack[T](ls: List[T]): List[List[T]] = {
      ls match {
        case Nil => Nil
        case _ =>
          val (packed, next) = ls span {
            _ == ls.head
          }
          packed :: pack(next)
      }
    }
  }

  object P10 {
    def encode[T](ls: List[T]): List[(Int, T)] = {
      ls match {
        case Nil => Nil
        case _ =>
          val (packed, next) = ls span {
            _ == ls.head
          }
          (packed.length, packed.head) :: encode(next)
      }
    }

    def encodeWithP09[T](ls: List[T]): List[(Int, T)] = P09.pack(ls) map { e => (e.length, e.head) }
  }
}
