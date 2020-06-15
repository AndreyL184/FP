package exercise2
import org.scalatest.FunSuite

class TestCompositions extends FunSuite {
  //test testCompose
  test("testCompose"){
    val A: (Int) => Long = _.toLong
    val B: (Long) => Double = _.toDouble
    val C: (Double) => String = _.toString
    val p = Compositions.testCompose(A)(B)(C)
    assert(p(23) == "23.0")
  }


  //test testMapFlatMap
  test("testMapFlatMap"){
    val a: (Int) => Long = _.toLong
    val b: (Long) => Double = _.toDouble

    val A: (Int) => Option[Long] = Some(_).map(a)
    val B: (Long) => Option[Double] = Some(_).map(b)
    val C: (Double) => String = _.toString
    val p = Compositions.testMapFlatMap(A)(B)(C)
    assert(p(Some(23)).toString == (Some("23.0").toString))
  }


  //test testForComprehension
  test("testForComprehension"){
    val a: (Int) => Long = _.toLong
    val b: (Long) => Double = _.toDouble

    val A: (Int) => Option[Long] = Some(_).map(a)
    val B: (Long) => Option[Double] = Some(_).map(b)
    val C: (Double) => String = _.toString
    val p = Compositions.testForComprehension(A)(B)(C)
    assert(p(Some(23)).toString == (Some("23.0").toString))
  }
}