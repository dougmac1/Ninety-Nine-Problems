import org.scalatest.{MustMatchers, WordSpec}

class CollectionProblemsPartTwoSpec extends WordSpec with MustMatchers {

  "CollectionProblemsPartTwo" should {

    val TDD2 = new CollectionProblemsPartTwo

    "return elements in their own list when given a,a,a,a,b,c,c,a,a,d,e,e,e,e" in {
      TDD2.sublists(List("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e")) mustEqual List(List("a", "a", "a", "a"), List("b"), List("c", "c"), List("a", "a"), List("d"), List("e", "e", "e", "e"))
    }

    "return the run-length encoding data compression when given a,a,a,a,b,c,c,a,a,d,e,e,e,e" in {
      TDD2.runLengthEncoding(List("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e")) mustEqual List((4, "a"), (1, "b"), (2, "c"), (2, "a"), (1, "d"), (4, "e"))
    }
  }
}

