package users

import users.UserUtils.UserImpl

class VenueManager(val firstName: String, val secondName: String, val address: String) extends UserImpl

object VenueManager {
  def apply(firstName: String, secondName: String, address: String): User = {
    new User(firstName, secondName, address)
  }
}

