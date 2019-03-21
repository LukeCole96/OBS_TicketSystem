name := "TicketSystem"

version := "0.1"

scalaVersion := "2.12.8"

libraryDependencies ++= {
  val testDependencies = Seq(
    "org.scalatest" %% "scalatest" % "3.0.5" % "test",
    "org.scalacheck" %% "scalacheck" % "1.14.0" % "test",
    "com.github.tomakehurst" % "wiremock-standalone" % "2.19.0" % "test",
    "org.json4s" %% "json4s-native" % "3.6.5" % "test"
  )

  val akkaDependencies = Seq(
    "com.typesafe.akka" %% "akka-http-testkit" % "10.1.5"
  )
  testDependencies ++ akkaDependencies
}