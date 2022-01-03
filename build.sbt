name := "KafkaStreams"

version := "0.1"

scalaVersion := "2.12.12"

val kafkaVersion = "3.0.0"

// https://mvnrepository.com/artifact/org.apache.kafka/kafka-streams
libraryDependencies += "org.apache.kafka" % "kafka-streams" % kafkaVersion

// https://mvnrepository.com/artifact/org.apache.kafka/kafka-streams-test-utils
libraryDependencies += "org.apache.kafka" % "kafka-streams-test-utils" % kafkaVersion % Test

// https://mvnrepository.com/artifact/junit/junit
libraryDependencies += "junit" % "junit" % "4.13.2" % Test

// https://mvnrepository.com/artifact/org.slf4j/slf4j-api
libraryDependencies += "org.slf4j" % "slf4j-api" % "1.7.32"

// https://mvnrepository.com/artifact/org.slf4j/slf4j-log4j12
libraryDependencies += "org.slf4j" % "slf4j-log4j12" % "1.7.32"

// https://mvnrepository.com/artifact/org.slf4j/slf4j-simple
libraryDependencies += "org.slf4j" % "slf4j-simple" % "1.7.32"

// https://mvnrepository.com/artifact/com.typesafe/config
libraryDependencies += "com.typesafe" % "config" % "1.4.1"

// https://mvnrepository.com/artifact/org.json/json
libraryDependencies += "org.json" % "json" % "20211205"



