package users

import org.scalatest._

class UserSpec extends FeatureSpec with Matchers with BeforeAndAfter with GivenWhenThen {

  feature("Create a new user") {
    scenario("Instantiate a user") {
      When("a user is created")
      val usr = new User("Luke", "Cole", "179 middleton road")

      Then("Verify the internals are created.")
      usr.firstName shouldBe "Luke"
      usr.secondName shouldBe "Cole"
      usr.address shouldBe "179 middleton road"
    }
  }
}
