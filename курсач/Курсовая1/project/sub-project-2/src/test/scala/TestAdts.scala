package exercise3
import org.scalatest.FunSuite
import scala.util.{Success}

class TestAdts extends FunSuite {
  //test testGetNth
  test("testGetNth"){
    val p = Adts.testGetNth(List(1, 2, 3, 4),2)
    assert(p == Some(3))
  }

  //test testDouble
  test("testDouble"){
    val p = Adts.testDouble(Some(3))
    assert(p == Some(6))
  }

  //test testIsEven
  test("testIsEven: 1"){
    val p = Adts.testIsEven(0)
    assert(p == Right(0))
  }
  test("testIsEven: 2"){
    val p = Adts.testIsEven(1)
    assert(p == Left("Нечетное число."))
  }

  //test testSafeDivide
  test("testSafeDivide: 1"){
    val p = Adts.testSafeDivide(1,1)
    assert(p == Right(1))
  }
  test("testSafeDivide: 2"){
    val p = Adts.testSafeDivide(1,0)
    assert(p == Left("Вы не можете делить на ноль."))
  }

  //test testGoodOldJava
  test("testGoodOldJava: 1"){
    val StringToInt: (String) => Int = Integer.parseInt(_)
    val p = Adts.testGoodOldJava(StringToInt,"1")
    assert(p == Success(1))
  }
  test("testGoodOldJava: 2"){
    val StringToInt: (String) => Int = Integer.parseInt(_)
    val p = Adts.testGoodOldJava(StringToInt,"a")
    assert(p == Success(0))
  }

}