package TestScala99

import org.scalatest.FlatSpec
import Scala99.P02

class P02Test extends FlatSpec {
  "penultimate(ls: List[Int])" should "return the second from last elemnt" in {
    assert(P02.penultimate(List(1,2,3,4,5,6,7,8)) === 7)
  }
}
