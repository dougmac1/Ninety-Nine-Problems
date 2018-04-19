class CollectionProblemsPartTwo {

  def sublists(list: List[String]) : List[List[String]] = {
    if (list.isEmpty) List(List())
    else {
      val (packed, next) = list span {
        _ == list.head
      }
      if (next == Nil) List(packed)
      else packed :: sublists(next)
    }
  }

  def runLengthEncoding(list : List[String]) : List[(Int, String)] = {
    sublists(list) map { e => (e.length, e.head) }
  }
}
