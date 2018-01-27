package Scala99

object P06 {
  def isPalindrome[T](ls: List[T]): Boolean = ls == P05.reverse(ls)
}
