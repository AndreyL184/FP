package exercise3
import exercise3.Maps.User
import org.scalatest.FunSuite

class TestMaps extends FunSuite{
  //test testGroupUsers
  test("testGroupUsers"){
    val l = Seq(User("A",2),User("B",6),User("A",12),User("B",66))
    val p = Maps.testGroupUsers(l)
    assert(p == Map(("A",7),("B",36)))
  }

  //test testNumberFrodos
  test("testNumberFrodos"){
    val l = Map(("1",User("Adam",12)),("2",User("AdamA",17)),("3",User("A",20)),("4",User("B",21)))
    val p = Maps.testNumberFrodos(l)
    assert(p == 2)
  }

  //test testUnderaged
  test("testUnderaged"){
    val l = Map(("1",User("A",24)),("2",User("B",36)),("3",User("C",20)))
    val p = Maps.testUnderaged(l)
    assert(p == Map("2" -> User("B",36)))
  }

}

