package exercise1
import org.scalatest.FunSuite

class TestFunctions extends FunSuite {
  //test testCircle
  test("testCircle"){
    val p = Functions.testCircle(4);
    assert(p == 16*Math.PI)
  }

  //test testRectangleCurried
  test("testRectangleCurried"){
    val p = Functions.testRectangleCurried(4,2)
    assert(p == 8)
  }

  //test testRectangleCurried
  test("testRectangleUc:"){
    val p = Functions.testRectangleUc(4,2)
    assert(p == 8)
  }
}