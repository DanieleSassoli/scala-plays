package Scala99

object P12 {
  def decode(ls: List[(Int, String)]) = ls.flatMap{case (times, value) => List.fill(times)(value)}
}
