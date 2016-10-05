name          := "minimal-scala-lib-seed"
organization  := "io.github.yeghishe"
version       := "0.0.1"
scalaVersion  := "2.11.8"
scalacOptions := Seq("-unchecked", "-feature", "-deprecation", "-encoding", "utf8")

resolvers += Resolver.jcenterRepo

libraryDependencies ++= {
  val scalazV          = "7.3.0-M5"
  val ficusV           = "1.2.7"
  val scalaTestV       = "3.0.0"
  val scalaMockV       = "3.3.0"
  val scalazScalaTestV = "1.0.0"
  Seq(
    "org.scalaz"    %% "scalaz-core"                 % scalazV,
    "com.iheart"    %% "ficus"                       % ficusV,
    "org.scalatest" %% "scalatest"                   % scalaTestV       % "it,test",
    "org.scalamock" %% "scalamock-scalatest-support" % scalaMockV       % "it,test",
    "org.scalaz"    %% "scalaz-scalacheck-binding"   % scalazV          % "it,test",
    "org.typelevel" %% "scalaz-scalatest"            % scalazScalaTestV % "it,test"
  )
}

lazy val root = project.in(file(".")).configs(IntegrationTest)
Defaults.itSettings

initialCommands := """|import scalaz._
                      |import Scalaz._
                      |import scala.concurrent._
                      |import scala.concurrent.duration._""".stripMargin

