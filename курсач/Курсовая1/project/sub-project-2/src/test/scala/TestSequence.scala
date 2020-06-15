package exercise3
import org.scalatest.FunSuite

class TestSequence extends FunSuite{
  //test testLastElement
  test("testLastElement"){
    val p = Sequence.testLastElement(Seq(1,2))
    assert(p == Some(2))
  }

  //test testZip
  test("testZip"){
    val p = Sequence.testZip(Seq(1, 2, 3, 4),Seq(1, 2, 3, 4))
    assert(p == Seq((1,1), (2,2), (3,3), (4,4)))
  }

  //test testForAll
  test("testForAll: false"){
    val not0 = (i: Int)=> i>0
    val p = Sequence.testForAll(Seq(0,1,2))(not0)
    assert(p == false)
  }

  test("testForAll: true"){
    val not0 = (i: Int)=> i>0
    val p = Sequence.testForAll(Seq(1,2))(not0)
    assert(p == true)
  }

  //test testPalindrom
  test("testPalindrom: false"){
    val p = Sequence.testPalindrom(Seq(0,1,2,2,1,1))
    assert(p == false)
  }

  test("testPalindrom: true"){
    val p = Sequence.testPalindrom(Seq(0,1,2,2,1,0))
    assert(p == true)
  }

  //test testFlatMap
  test("testFlatMap: true"){
    val con = (i: Seq[Int])=> i
    val p = Sequence.testFlatMap(Seq(Seq(1,1),Seq(1,1)))(con)
    assert(p == Seq(1,1,1,1))
  }

}