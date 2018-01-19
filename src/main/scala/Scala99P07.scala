object Scala99P07 extends App{
  def flatten(ls: List[Any]): List[Any] = {
    ls.flatMap { _ match {
        case Nil => Nil
        case elem: Int => List(elem)
        case elem: String => List(elem)
        case elem: List[Any] => elem
      }
    }
  }
  println(flatten(List(List(1,2), 1, 2, List(3,5,7,8))))
}

