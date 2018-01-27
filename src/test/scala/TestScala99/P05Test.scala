package TestScala99

import Scala99.P05
import org.scalatest.FlatSpec

class P05Test extends FlatSpec{
  "reverse(ls: List[Int])" should "reverse the list ints" in {
    assert(P05.reverse(List(1,2,3,4,5,6,7,8,9)) == List(9,8,7,6,5,4,3,2,1))
  }

  "reverse" should "reverse the list of string" in {
    assert(P05.reverse(List("c", "b", "a")) == List("a", "b", "c"))
  }

  "reverse and reverseRecursive" should "return the same result" in {
    val ls = List(1,2,3,4,5,6,7,8,9)
    assert(P05.reverse(ls) == P05.reverseRecursive(ls))
  }
}
