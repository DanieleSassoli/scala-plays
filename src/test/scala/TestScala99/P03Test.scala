package TestScala99

import Scala99.P03
import org.scalatest.FlatSpec

class P03Test extends FlatSpec{
  val ls = List(1,2,3,4,5,6,7,8,9)
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
}
