name := """final-project-starter"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.6"

crossScalaVersions := Seq("2.11.12", "2.12.4")

libraryDependencies += guice

//GUI
libraryDependencies += "org.webjars" % "bootstrap" % "4.3.1"

//Database
libraryDependencies += javaJpa
libraryDependencies += javaJdbc
libraryDependencies += "org.hibernate" % "hibernate-core" % "5.3.9.Final"
libraryDependencies += "org.mariadb.jdbc" % "mariadb-java-client" % "2.4.0"

// Testing libraries for dealing with CompletionStage...
libraryDependencies += "org.assertj" % "assertj-core" % "3.6.2" % Test
libraryDependencies += "org.awaitility" % "awaitility" % "2.0.0" % Test

// Make verbose tests
testOptions in Test := Seq(Tests.Argument(TestFrameworks.JUnit, "-a", "-v"))
