import sbt._

class Plugins(info: ProjectInfo) extends PluginDefinition(info)
{
  val codaRepo = "Coda Hale's Repository" at "file:///home/ross/.m2/repository"
  val mavenSBT = "com.codahale" % "maven-sbt" % "0.1.1-SNAPSHOT"
}
