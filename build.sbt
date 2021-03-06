name := """play243java"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)


scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  "org.webjars" % "requirejs" % "2.1.20",
  "org.webjars" % "jquery" % "2.1.4",

  "org.postgresql" % "postgresql" % "9.3-1101-jdbc41",
  "junit" % "junit" % "4.12" % "test",
  "org.mockito" % "mockito-all" % "1.9.5" % "test"
)

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator

