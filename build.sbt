name := "jpeg"

organization := "com.mitre"

version := "0.0.1"

scalaVersion := "2.11.8"

testOptions in ThisBuild += Tests.Argument(TestFrameworks.JUnit, "-v")

resolvers in ThisBuild += "NCSA Sonatype Releases" at "https://opensource.ncsa.illinois.edu/nexus/content/repositories/releases"

libraryDependencies in ThisBuild := Seq(
  "junit" % "junit" % "4.11" % "test",
  "com.novocode" % "junit-interface" % "0.10" % "test",
  "edu.illinois.ncsa" %% "daffodil-tdml" % "2.0.0-SNAPSHOT" % "test"
)

scmInfo := Some(
  ScmInfo(
    browseUrl = url("https://github.com/DFDLSchemas/jpeg"),
    connection = "scm:git:https://github.com/DFDLSchemas/jpeg.git")
  )

homepage in ThisBuild := Some(url("https://github.com/DFDLSchemas/jpeg"))
