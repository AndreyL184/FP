package exercise2
import org.scalatest.FunSuite

class TestRecursiveData extends FunSuite {
  //test testListIntEmpty
  test("testListIntEmpty: 1"){
    val p = RecursiveData.testListIntEmpty(Nil());
    assert(p == true)
  }

  test("testListIntEmpty: 2"){
    val p = RecursiveData.testListIntEmpty(Cons(0,Nil()));
    assert(p == false)
  }


  //testListIntHead
  test("testListIntHead: 1"){
    val p = RecursiveData.testListIntHead(Cons(0,Nil()));
    assert(p == 0)
  }

  test("testListIntHead: 2"){
    val p = RecursiveData.testListIntHead(Nil());
    assert(p == -1)
  }
}