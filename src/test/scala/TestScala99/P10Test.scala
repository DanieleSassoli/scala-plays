package TestScala99

import Scala99.P10
import org.scalatest.{FlatSpec, Matchers}

class P10Test extends FlatSpec with Matchers{
  //length-encoding data compression method. Consecutive duplicates of elements are encoded as
  // tuples (N, E) where N is the number of duplicates of the element E.
  "encode" should "run length-encoding of a list" in {
    val ls = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    P10.encode(ls) should be (List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
  }

  "encodeWithP09" should "return the same result as encode" in {
    val ls = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    P10.encode(ls) should be (P10.encodeWithP09(ls))
  }
}
