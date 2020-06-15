package exercise2
import org.scalatest.FunSuite

class TestRecursiveFunctions extends FunSuite {

  var l1:List[Int]=Cons(1,Cons(2,Cons(3,Nil())))
  var l2:List[Int]=Cons(4,Cons(5,Cons(6,Nil())))
  var l3:List[List[Int]]=Cons(Cons(1,Cons(2,Cons(3,Nil()))), Cons(Cons(4,Cons(5,Cons(6,Nil()))),Nil()))
  val InDouble: (Int) => Double = _*2
  val InList: List[Int] => List[Int] = _ match{
    case Cons(head, tail) => Cons(head,tail)
    case Nil() => Nil()
  }


  //test testReverse
  test("testReverse"){
    val p = RecursiveFunctions.testReverse(l1);
    assert(p == Cons(3,Cons(2,Cons(1,Nil()))))
  }

  //test testMap
  test("testMap"){
    val p = RecursiveFunctions.testMap(l1,InDouble);
    assert(p == Cons(2.0,Cons(4.0,Cons(6.0,Nil()))))
  }

  //test testAppend
  test("testAppend"){
    val p = RecursiveFunctions.testAppend(l1,l2);
    assert(p == Cons(1,Cons(2,Cons(3,Cons(4,Cons(5,Cons(6,Nil())))))))
  }

  //test testFlatMap
  test("testFlatMap"){
    val p = RecursiveFunctions.testFlatMap(l3,InList)
    assert(p == Cons(1,Cons(2,Cons(3,Cons(4,Cons(5,Cons(6,Nil())))))))
  }


}