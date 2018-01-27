package TestScala99

import Scala99.P06
import org.scalatest.FlatSpec

class P06Test extends FlatSpec {
  "isPalindrome(ls: List[Int])" should "return true for a palindrome list" in {
    assert(P06.isPalindrome(List(1,2,3,2,1)) == true)
  }

  "isPalindrome(ls: List[Int])" should "return false for a non palindrome list" in {
    assert(P06.isPalindrome(List(1,2,3,4,5)) == false)
  }

  "isPalindrome[T](ls: List[T])" should "work with a list any type" in {
    assert(P06.isPalindrome(List("a", "b", "c", "b", "a")) == true)
  }
}
