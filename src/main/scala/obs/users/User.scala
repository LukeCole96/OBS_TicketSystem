package users

import java.io.{File, PrintWriter}
import users.userutils.UserImpl
import scala.io.Source

class User(val firstName: String, val secondName: String, val address: String) extends UserImpl {
  def getLogin: String = {
    s"$firstName $secondName \naddress is: $address"
  }

  def createUser(userType: String): User = {
    userType match {
      case "Agent" => new Agent(firstName, secondName, address)
      case "Venue Manager" => new VenueManager(firstName, secondName, address)
      case "Customer" => new Customer(firstName, secondName, address)
    }
  }

  def createLogin(usr: User) = {
    val writer = new PrintWriter(new File("src/main/scala/obs/users/userutils/existingusers/details.conf"))
    writer.write(s"${usr.firstName} ${usr.secondName}")
    writer.close()
  }

  def authenticateLogin(usr: User): Boolean = {
    val fileResult = Source.fromFile("src/main/scala/obs/users/userutils/existingusers/details.conf").getLines.toArray
    val guard: Int = if (fileResult.contains(s"${usr.firstName} ${usr.secondName}")) 1 else 0
    guard match {
      case 0 => println("Unable to log user in, created an account?"); false
      case 1 => println("You're in"); true
    }
  }
}


object User {
  def apply(firstName: String, secondName: String, address: String): User = {
    new User(firstName, secondName, address)
  }
}