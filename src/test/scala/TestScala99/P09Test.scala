package TestScala99

import Scala99.P09
import org.scalatest.{FlatSpec, Matchers}

class P09Test extends FlatSpec with Matchers{
  "pack" should "compress consecutive duplicate elements in a sublist" in {
    val ls = List("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e")
    P09.pack(ls) should be (List(List("a", "a", "a", "a"), List("b"), List("c", "c"), List("a", "a"), List("d"), List("e", "e", "e", "e")))
  }
}
