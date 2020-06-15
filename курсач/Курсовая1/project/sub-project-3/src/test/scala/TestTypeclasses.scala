package exercise4
import org.scalatest.FunSuite

class TestTypeclasses extends FunSuite {
  //test testReversableString
  test("testReversableString"){
    val p = Typeclasses.testReversableString("abcd")
    assert(p == "dcba")
  }
  //test testSmashInt
  test("testSmashInt"){
    val p = Typeclasses.testSmashInt(3,1)
    assert(p == 4)
  }
  //test testSmashDouble
  test("testSmashDouble"){
    val p = Typeclasses.testSmashDouble(1,2)
    assert(p == 2.0)
  }
  //test testSmashString
  test("testSmashString"){
    val p = Typeclasses.testSmashString("ab", "cd")
    assert(p == "abcd")
  }
}
