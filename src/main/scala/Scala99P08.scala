object Scala99P08 extends App{
  def compact(ls: List[Int]): List[Int] = {
    ls match {
      case Nil => Nil
      case h :: tail => h :: compact(tail.dropWhile(h == _))
    }
  }
  println(compact(List(1,1,1,2,2,3,3,3,3,4,4,5,6,7,7,7,8,9,9)))
}
