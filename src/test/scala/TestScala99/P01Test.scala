package TestScala99

import Scala99.P01
import org.scalatest.FlatSpec

class P01Test extends FlatSpec{

  "last(ls: List[Int])" should "return the last element of a list" in {
    assert(P01.last(List(1,2,3,4,5,6,7,8,9)) === 9)
  }
}
