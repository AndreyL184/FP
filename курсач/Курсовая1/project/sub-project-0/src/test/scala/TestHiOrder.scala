package exercise1
import org.scalatest.FunSuite

class TestHiOrder extends FunSuite {
  //test testNTimes
  val plus: (Int, Int) => Int = _ + _
  test("testNTimes"){
    val p = HigherOrder.testNTimes(plus,2,3,5)
    assert(p == 25)
  }

  //test testAnonymousNTimes
  test("testAnonymousNTimes"){
    val p = HigherOrder.testAnonymousNTimes(3,5,2)
    assert(p == 10)
  }
}