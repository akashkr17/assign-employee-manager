
import Dependencies.testDependencies
name := "assign-employee-manager"

version := "0.1"

scalaVersion := "2.13.6"

lazy val root = (project in file("."))
  .settings(
    name := "root",
    libraryDependencies ++= testDependencies
  )