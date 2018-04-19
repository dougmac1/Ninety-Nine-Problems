class CollectionProblems {

  def lastElement(list: List[Int]): Int = {
    list.last
  }

  def penultimate(list: List[Int]): Int = {
    list.init.last
  }

  def nthNumber(number: Int, list: List[Int]): Any = {
    if (number >= 0) list(number)
  }

  def listSize(list: List[Int]): Int = {
    list.length
  }

  def reversed(list: List[Int]): List[Int] = {
    list.reverse
  }

  def palindrome(list: List[Int]): Boolean = {
    list == list.reverse
  }

  def flatten(list: List[Any]): List[Any] = list flatMap {
    case i: List[_] => flatten(i)
    case e => List(e)
  }

  def removeDuplicates(list: List[String]) : List[String] = list match {
    case Nil => Nil
    case h :: tail => h :: removeDuplicates(tail.dropWhile(_ == h))
  }

}

