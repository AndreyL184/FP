package exercise1
import exercise1.PatternMatching._
import org.scalatest.FunSuite

class TestPatterns extends FunSuite {
  //test testIntToString
  test("testIntToString: 1 = \"it is one\""){
    val p = PatternMatching.testIntToString(1)
    assert(p == "it is one")
  }
  test("testIntToString: 2 = \"it is two\""){
    val p = PatternMatching.testIntToString(2)
    assert(p == "it is two")
  }
  test("testIntToString: 3 = \"it is three\""){
    val p = PatternMatching.testIntToString(3)
    assert(p == "it is three")
  }
  test("testIntToString: 4 = \"what's that\""){
    val p = PatternMatching.testIntToString(4)
    assert(p == "what's that")
  }


  //test testIsMaxAndMoritz
  test("testIsMaxAndMoritz: 1"){
    val p = PatternMatching.testIsMaxAndMoritz("max")
    assert(p == true)
  }
  test("testIsMaxAndMoritz: 2"){
    val p = PatternMatching.testIsMaxAndMoritz("Max")
    assert(p == true)
  }
  test("testIsMaxAndMoritz: 3"){
    val p = PatternMatching.testIsMaxAndMoritz("moritz")
    assert(p == true)
  }
  test("testIsMaxAndMoritz: 4"){
    val p = PatternMatching.testIsMaxAndMoritz("Moritz")
    assert(p == true)
  }


  //test testIsEven
  test("testIsEven: 1"){
    val p = PatternMatching.testIsEven(3)
    assert(p == false)
  }
  test("testIsEven: 2"){
    val p = PatternMatching.testIsEven(2)
    assert(p == true)
  }


  //test testWinsA
  test("testWinsA: 1"){
    val p = PatternMatching.testWinsA(PatternMatching.Rock,PatternMatching.Rock)
    assert(p == PatternMatching.Draw)
  }
  test("testWinsA: 2"){
    val p = PatternMatching.testWinsA(PatternMatching.Rock,PatternMatching.Paper)
    assert(p == PatternMatching.Lose)
  }
  test("testWinsA: 3"){
    val p = PatternMatching.testWinsA(PatternMatching.Rock,PatternMatching.Scissor)
    assert(p == PatternMatching.Win)
  }
  test("testWinsA: 4"){
    val p = PatternMatching.testWinsA(PatternMatching.Paper,PatternMatching.Rock)
    assert(p == PatternMatching.Win)
  }
  test("testWinsA: 5"){
    val p = PatternMatching.testWinsA(PatternMatching.Paper,PatternMatching.Paper)
    assert(p == PatternMatching.Draw)
  }
  test("testWinsA: 6"){
    val p = PatternMatching.testWinsA(PatternMatching.Paper,PatternMatching.Scissor)
    assert(p == PatternMatching.Lose)
  }
  test("testWinsA: 7"){
    val p = PatternMatching.testWinsA(PatternMatching.Scissor,PatternMatching.Rock)
    assert(p == PatternMatching.Lose)
  }
  test("testWinsA: 8"){
    val p = PatternMatching.testWinsA(PatternMatching.Scissor,PatternMatching.Paper)
    assert(p == PatternMatching.Win)
  }
  test("testWinsA: 9"){
    val p = PatternMatching.testWinsA(PatternMatching.Scissor,PatternMatching.Scissor)
    assert(p == PatternMatching.Draw)
  }


  //test testExtractMammalWeight
  test("testExtractMammalWeight: 1"){
    val p = PatternMatching.testExtractMammalWeight(Mammal("Cat",Meat,5))
    assert(p == 5)
  }
  test("testExtractMammalWeight: 2"){
    val p = PatternMatching.testExtractMammalWeight(Fish("Salmon",Plants))
    assert(p == -1)
  }


  //test testUpdateFood
  test("testUpdateFood: 1"){
    val p = PatternMatching.testUpdateFood(Mammal("Cat",Meat,5))
    assert(p.food == Meat)
  }
  test("testUpdateFood: 2"){
    val p = PatternMatching.testUpdateFood(Fish("Salmon",Meat))
    assert(p.food == Plants)
  }
  test("testUpdateFood:3"){
    val p = PatternMatching.testUpdateFood(Bird("Parrot",Meat))
    assert(p.food == Plants)
  }
}