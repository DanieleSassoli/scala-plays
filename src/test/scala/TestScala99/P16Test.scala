package TestScala99

import Scala99.P16
import org.scalatest.{FlatSpec, Matchers}

class P16Test extends FlatSpec with Matchers {
  "drop" should "drop every 3rd element of a list" in {
    val ls = List("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k")
    P16.drop(3, ls) should be (List("a", "b", "d", "e", "g", "h", "j", "k"))
  }

  "drop" should "drop every 4th element of a list" in {
    val ls = List("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k")
    P16.drop(4, ls) should be (List("a", "b", "c", "e", "f", "g", "i", "j", "k"))
  }
}
