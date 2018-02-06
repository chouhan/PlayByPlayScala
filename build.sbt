name := "PlayByPlayScala"

version := "0.1"

scalaVersion := "2.12.4"

//libraryDependencies ++= Seq("org.scalatest" % "scalatest_2.10" % "2.0" % "test", "com.novocode" % "junit-interface" % "0.9" % "test")

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.1"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"

// Testing using Specs2

libraryDependencies ++= Seq("org.specs2" %% "specs2-core" % "3.9.5" % "test")

//https://www.jetbrains.com/help/idea/run-debug-and-test-scala.html

scalacOptions += "-Ylog-classpath"