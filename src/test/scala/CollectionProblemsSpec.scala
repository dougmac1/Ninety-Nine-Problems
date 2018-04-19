import org.scalatest.{MustMatchers, WordSpec}

class CollectionProblemsSpec extends WordSpec with MustMatchers {

  "CollectionProblems" should {

    val TDD = new CollectionProblems

    "when given a list of 1,1,2,3,5,8 return the last element in the list '8'" in {

      TDD.lastElement(List(1,1,2,3,5,8)) mustEqual 8
    }

    "when given a list off 1,1,2,3,5,8 return the penultimate number in the list '5'" in {
      TDD.penultimate(List(1,1,2,3,5,8)) mustEqual 5
    }
  }

}
