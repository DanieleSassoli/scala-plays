package TestScala99

import Scala99.P01ToP10._
import org.scalatest.{FlatSpec, Matchers}

class P01ToP10 extends FlatSpec with Matchers {
  //<editor-fold desc="P01Test">
  "last(ls: List[Int])" should "return the last element of a list" in {
    assert(P01.last(List(1, 2, 3, 4, 5, 6, 7, 8, 9)) === 9)
  }
  //</editor-fold>

  //<editor-fold desc="P02Test">
  "penultimate(ls: List[Int])" should "return the second from last elemnt" in {
    assert(P02.penultimate(List(1, 2, 3, 4, 5, 6, 7, 8)) === 7)
  }
  //</editor-fold>

  //<editor-fold desc="P03Test">
  val ls = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
  "kth(ls: List[Int])" should "return 2nd element of list when invoked with 2 as first param" in {
    val index = 2
    assert(P03.kth(index, ls).right.get === ls(index))
  }

  "kth(ls: List[Int])" should "return 4nd element of list when invoked with 4 as first param" in {
    val index = 4
    assert(P03.kth(index, ls).right.get === ls(index))
  }

  "kth(ls: List[Int])" should "return NoSuchElementException if index doesn't exist" in {
    val index = -3
    assert(P03.kth(index, ls).left.get.toString === new IndexOutOfBoundsException("-3").toString)
  }
  //</editor-fold>

  //<editor-fold desc="P05Test">
  "reverse(ls: List[Int])" should "reverse the list ints" in {
    assert(P05.reverse(List(1, 2, 3, 4, 5, 6, 7, 8, 9)) == List(9, 8, 7, 6, 5, 4, 3, 2, 1))
  }
  "reverse" should "reverse the list of string" in {
    assert(P05.reverse(List("c", "b", "a")) == List("a", "b", "c"))
  }

  "reverse and reverseRecursive" should "return the same result" in {
    val ls = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
    assert(P05.reverse(ls) == P05.reverseRecursive(ls))
  }
  //</editor-fold>

  //<editor-fold desc="P06Test">
  "isPalindrome(ls: List[Int])" should "return true for a palindrome list" in {
    assert(P06.isPalindrome(List(1, 2, 3, 2, 1)) == true)
  }

  "isPalindrome(ls: List[Int])" should "return false for a non palindrome list" in {
    assert(P06.isPalindrome(List(1, 2, 3, 4, 5)) == false)
  }

  "isPalindrome[T](ls: List[T])" should "work with a list any type" in {
    assert(P06.isPalindrome(List("a", "b", "c", "b", "a")) == true)
  }
  //</editor-fold>

  //<editor-fold desc="P07Test">
  "flatten" should "return a flattened list" in {
    P07.flatten(List(List(1, 1), 2, List(3, List(5, 8)))) should be(List(1, 1, 2, 3, 5, 8))
  }
  //</editor-fold>

  //<editor-fold desc="P08Test">
  "compact" should "compact a eliminate consecutive duplicates of list elements" in {
    P08.compact(List(1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4, 5, 6, 7, 7, 7, 8, 9, 9)) should be(List(1, 2, 3, 4, 5, 6, 7, 8, 9))
  }

  "compact" should "work with any type" in {
    val ls = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
    P08.compact(ls) should be(List('a', 'b', 'c', 'a', 'd', 'e'))
  }
  //</editor-fold>

  //<editor-fold desc="P09Test">
  "pack" should "compress consecutive duplicate elements in a sublist" in {
    val ls = List("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e")
    P09.pack(ls) should be(List(List("a", "a", "a", "a"), List("b"), List("c", "c"), List("a", "a"), List("d"), List("e", "e", "e", "e")))
  }
  //</editor-fold>

  //<editor-fold desc="P10Test">
  //length-encoding data compression method. Consecutive duplicates of elements are encoded as
  // tuples (N, E) where N is the number of duplicates of the element E.
  "encode" should "run length-encoding of a list" in {
    val ls = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    P10.encode(ls) should be(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
  }

  "encodeWithP09" should "return the same result as encode" in {
    val ls = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    P10.encode(ls) should be(P10.encodeWithP09(ls))
  }
  //</editor-fold>
}