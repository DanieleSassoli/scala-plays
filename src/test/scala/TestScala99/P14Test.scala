package TestScala99

import Scala99.P14
import org.scalatest.{FlatSpec, Matchers}

class P14Test extends FlatSpec with Matchers {
  "duplicate" should "duplicate elements in a list" in {
    val ls = List("a", "b", "c", "c", "d")
    P14.duplicate(ls) should be(List("a", "a", "b", "b", "c", "c", "c", "c", "d", "d"))
  }

  "duplicate" should "duplicate elements in a list N amount of times" in {
    val ls = List("a", "b", "c", "c", "d")
    P14.duplicate(ls, 3) should be(List("a", "a", "a", "b", "b", "b", "c", "c", "c", "c", "c", "c", "d", "d", "d"))
  }
}
