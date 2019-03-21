
import users.User

object Obs  {
  var input = scala.io.StdIn.readLine().toLowerCase

  val interface = InterfaceUtils
  val hasAccount = interface.interfaceLogin()
  if(hasAccount) {
    println(interface.interfaceOutput_fName)
    val firstName = input
    println(interface.interfaceOutput_sName)
    val secondName = input
    println(interface.interfaceOutput_address)
    val address = input
    println(s"So, $firstName $secondName \nAnd your address is: $address.")
    val user = new User("setup", "setup", "setup")
    user.createLogin(new User(firstName, secondName, address))
  }
}

object InterfaceUtils {
  var input = scala.io.StdIn.readLine().toLowerCase

  def interface_generic(pageName: String, content: String): Unit = {
    val interfaceOutput =
      s"""
         |*******************************************************
         |* $pageName
         |*******************************************************
         |      $content
      """.stripMargin
    input
  }

  def interfaceLogin(): Boolean = {
    val start = println(interface_generic("LOGIN", "So, welcome to OBS... do you have an account? \nY or N"))
    input

    if (input == "y" || input == "n") {
      input match {
        case "y" => println("Awesome. Let's go and login."); true
        case "n" => println("Right, let's create an account..."); false
      }
    } else {
      println(s"We didn't recognise your input of $input, we'll assume you don't have an account..."); false
    }
  }

  val interfaceOutput_fName =
    s"""
       |*******************************************************
       |* Login
       |*******************************************************
       |  What is your name?
      """.stripMargin

  val interfaceOutput_sName =
    s"""
       |*******************************************************
       |* Login
       |*******************************************************
       |  What is your second name?
      """.stripMargin

  val interfaceOutput_address =
    s"""
       |*******************************************************
       |* Login
       |*******************************************************
       |  What is your address?
      """.stripMargin

}
