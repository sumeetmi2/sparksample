name := "MySampleSparkProject"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies += "org.apache.spark" % "spark-core_2.11" % "2.2.0" % "provided"
libraryDependencies += "org.apache.spark" % "spark-hive_2.11" % "2.2.0"
libraryDependencies += "org.apache.spark" % "spark-sql_2.11" % "2.2.0" % "provided"
