package TestScala99

import Scala99.P11ToP20._
import org.scalatest.{FlatSpec, Matchers}

class P11ToP20 extends FlatSpec with Matchers{
  //<editor-fold desc="P11Test">
  "encodeModified" should "Modify the result of problem P10 in such a way that if an element has no duplicates it is " +
    "simply copied into the result list" in {
    val ls = List("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e")
    P11.encodeModified(ls) should be (List((4,"a"), "b", (2,"c"), (2,"a"), "d", (4,"e")))
  }

  //<editor-fold desc="P12Test">
  "decode" should "generate the uncompressed version of P10" in {
    val ls = List((4, "a"), (1, "b"), (2, "c"), (2, "a"), (1, "d"), (4, "e"))
    P12.decode(ls) should be (List("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e"))
  }
  //</editor-fold>

  //<editor-fold desc="P14Test">
  "duplicate" should "duplicate elements in a list" in {
    val ls = List("a", "b", "c", "c", "d")
    P14.duplicate(ls) should be(List("a", "a", "b", "b", "c", "c", "c", "c", "d", "d"))
  }

  "duplicate" should "duplicate elements in a list N amount of times" in {
    val ls = List("a", "b", "c", "c", "d")
    P14.duplicate(ls, 3) should be(List("a", "a", "a", "b", "b", "b", "c", "c", "c", "c", "c", "c", "d", "d", "d"))
  }
  //</editor-fold>

  //<editor-fold desc="P16Test">
  "drop" should "drop every 3rd element of a list" in {
    val ls = List("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k")
    P16.drop(3, ls) should be (List("a", "b", "d", "e", "g", "h", "j", "k"))
  }

  "drop" should "drop every 4th element of a list" in {
    val ls = List("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k")
    P16.drop(4, ls) should be (List("a", "b", "c", "e", "f", "g", "i", "j", "k"))
  }
  //</editor-fold>

  //<editor-fold desc="P17Test">
  "split" should "split a list in 2 parts of parametrized length" in {
    val ls = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    P17.split(3, ls) should be (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  }
  //</editor-fold>

}
