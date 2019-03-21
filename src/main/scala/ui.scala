class ui {}

object ui {
  def apply(pageName: String, content: String): Unit = {
    println(
      s"""
        |*******************************************************
        |*  $pageName
        |*******************************************************
        |*
        |*  $content
        |*
        |*
      """.stripMargin)
  }
}
