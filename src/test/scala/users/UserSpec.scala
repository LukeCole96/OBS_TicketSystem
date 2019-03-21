package users

import org.scalatest._

class UserSpec extends FeatureSpec with Matchers with BeforeAndAfter with GivenWhenThen {

  feature("Create a new user") {
    scenario("Instantiate a user") {
      When("a user is created")
      val usr = new User("Luke", "Cole", "179 middleton road")
      val vmUser = new VenueManager("testVm", "testVm", "testRoad")
      val agent = new Agent("testAgent", "testAgent", "testRoad")
      val customer = new Customer("testCustomer", "testCustomer", "testRoad")

      Then("Verify the internals are created.")
      usr.firstName shouldBe "Luke"
      usr.secondName shouldBe "Cole"
      usr.address shouldBe "179 middleton road"

      And("A venue manager is created")
      vmUser.firstName shouldBe "testVm"
      vmUser.secondName shouldBe "testVm"
      vmUser.address shouldBe "testRoad"

      And("A agent is created")
      agent.firstName shouldBe "testAgent"
      agent.secondName shouldBe "testAgent"
      agent.address shouldBe "testRoad"

      And("A customer is created")
      customer.firstName shouldBe "testCustomer"
      customer.secondName shouldBe "testCustomer"
      customer.address shouldBe "testRoad"
    }
  }
}
