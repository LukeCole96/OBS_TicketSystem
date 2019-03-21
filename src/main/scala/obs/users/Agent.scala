package users

class Agent(override val firstName: String, override val secondName: String, override val address: String) extends User(firstName, secondName, address) {
  override def getLogin: String = super.getLogin
}

object Agent {
  def apply(firstName: String, secondName: String, address: String): User = {
    new User(firstName, secondName, address)
  }
}