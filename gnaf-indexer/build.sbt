name := "gnaf-indexer"

libraryDependencies ++= Seq(
  "com.github.scopt" %% "scopt" % "3.3.0",
  "com.jsuereth" %% "scala-arm" % "2.0.0-M1",
  "au.csiro.data61.gnaf" %% "gnaf-common" % "0.1-SNAPSHOT"
  )

libraryDependencies ++= Seq(
  "com.fasterxml.jackson.module" %% "jackson-module-scala",
  "com.fasterxml.jackson.core" % "jackson-annotations"
) map (_ % "2.7.2")