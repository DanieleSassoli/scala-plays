package TestScala99

import Scala99.P07
import org.scalatest.{FlatSpec, Matchers}

class P07Test extends FlatSpec with Matchers{
  "flatten" should "return a flattened list" in {
    P07.flatten(List(List(1, 1), 2, List(3, List(5, 8)))) should be (List(1, 1, 2, 3, 5, 8))
  }
}
