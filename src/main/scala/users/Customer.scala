package users

import users.UserUtils.UserImpl

class Customer(val firstName: String, val secondName: String, val address: String) extends UserImpl

object Customer {
  def apply(firstName: String, secondName: String, address: String): User = {
    new User(firstName, secondName, address)
  }
}

