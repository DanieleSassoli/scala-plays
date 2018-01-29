package TestScala99

import Scala99.P17
import org.scalatest.{FlatSpec, Matchers}

class P17Test extends FlatSpec with Matchers {
  "split" should "split a list in 2 parts of parametrized length" in {
    val ls = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    P17.split(3, ls) should be (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  }
}
