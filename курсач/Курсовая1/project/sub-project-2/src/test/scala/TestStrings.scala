package exercise3
import org.scalatest.FunSuite

class TestStrings extends FunSuite {


  //test testUppercase
  test("testUppercase") {
    val p = Strings.testUppercase("abc")
    assert(p == "ABC")
  }


  //test testInterpolations
  test("testInterpolations") {
    val p = Strings.testInterpolations("Andre", 19)
    assert(p == "Hi my name is Andre and I am 19 years old.")
  }


  //test testComputation
  test("testComputation") {
    val p = Strings.testComputation(0, 1)
    assert(p == "Hi,\nnow follows a quite hard calculation. We try to add:\n\ta := 0\n\tb := 1\n\n\tresult is 1")
  }


  //test testTakeTwo
  test("testTakeTwo") {
    val p = Strings.testTakeTwo("abcd")
    assert(p == "ab")
  }
}
