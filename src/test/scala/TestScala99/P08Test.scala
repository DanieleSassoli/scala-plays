package TestScala99

import org.scalatest.{FlatSpec, Matchers}
import Scala99.P08


class P08Test extends FlatSpec with Matchers {
  "compact" should "compact a eliminate consecutive duplicates of list elements" in {
    P08.compact(List(1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4, 5, 6, 7, 7, 7, 8, 9, 9)) should be(List(1, 2, 3, 4, 5, 6, 7, 8, 9))
  }

  "compact" should "work with any type" in {
    val ls = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
    P08.compact(ls) should be(List('a', 'b', 'c', 'a', 'd', 'e'))
  }
}
