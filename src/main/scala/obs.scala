import java.io.{File, PrintWriter}

import users.User

import scala.io.Source

object obs extends App {

}

object InterfaceUtils {
  def interface(pageName: String, content: String) = {
    val interfaceOutput =
      s"""
         |*******************************************************
         |* $pageName
         |*******************************************************
         |      $content
      """.stripMargin
  }
}
