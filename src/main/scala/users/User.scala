package users

import users.UserUtils.UserImpl

case class User(val firstName: String, val secondName: String, val address: String) extends UserImpl

object User {
  def apply(firstName: String, secondName: String, address: String): User = {
    new User(firstName, secondName, address)
  }
}
