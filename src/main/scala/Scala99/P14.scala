package Scala99

object P14 {
  def duplicate(ls: List[String], n: Int = 2): List[String] = ls.flatMap(List.fill(n)(_))
}
