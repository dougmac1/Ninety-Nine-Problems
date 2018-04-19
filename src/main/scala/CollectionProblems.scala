class CollectionProblems {

  def lastElement(list : List[Int]) : Int = {
    list.last
  }

  def penultimate(list : List[Int]) : Int = {
    list.init.last
  }

  def nthNumber(number : Int, list : List[Int]) : Any = {
    if (number >= 0) list(number)
  }

  def listSize(list : List[Int]) : Int = {
    list.length
  }

  def reversed(list : List[Int]) : List[Int] = {
    list.reverse
  }

  def palindrome(list : List[Int]) : Boolean = {
    list == list.reverse
  }



}
