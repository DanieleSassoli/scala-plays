package TestScala99

import Scala99.P12
import org.scalatest.{FlatSpec, Matchers}

class P12Test extends FlatSpec with Matchers{
  "decode" should "generate the uncompressed version of P10" in {
    val ls = List((4, "a"), (1, "b"), (2, "c"), (2, "a"), (1, "d"), (4, "e"))
    P12.decode(ls) should be (List("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e"))
  }
}
