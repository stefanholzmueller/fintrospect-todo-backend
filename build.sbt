name := "fintrospect-todo-backend"

version := "1.0"

scalaVersion := "2.11.8"

resolvers += "JCenter" at "https://jcenter.bintray.com"

libraryDependencies ++= Seq(
  "io.fintrospect" %% "fintrospect-core" % "13.18.0",
  "io.fintrospect" %% "fintrospect-circe" % "13.18.0",
  "io.circe" %% "circe-optics" % "0.6.1",
  "org.scalatest" %% "scalatest" % "3.0.0" % "test"
)

enablePlugins(JavaAppPackaging)