ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.14"

lazy val root = (project in file("."))
  .settings(
    name := "java-interview",
    libraryDependencies += "io.vavr" % "vavr" % "1.0.0-alpha-4"  )


