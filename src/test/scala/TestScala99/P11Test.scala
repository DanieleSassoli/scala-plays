package TestScala99

import Scala99.P11
import org.scalatest.{FlatSpec, Matchers}

class P11Test extends FlatSpec with Matchers {
  "encodeModified" should "Modify the result of problem P10 in such a way that if an element has no duplicates it is " +
    "simply copied into the result list" in {
    val ls = List("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e")
    P11.encodeModified(ls) should be (List((4,"a"), "b", (2,"c"), (2,"a"), "d", (4,"e")))
  }
}
