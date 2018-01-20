package Scala99

import scala.util.{Failure, Success, Try}

object P03 {
  def kth(i: Int, ls: List[Int]): Either[Throwable, Int] = Try(ls(i)) match {
    case Success(elem) => Right(elem)
    case Failure(t) => Left(t)
  }
}
