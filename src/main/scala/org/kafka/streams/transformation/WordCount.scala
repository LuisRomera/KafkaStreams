package org.kafka.streams.transformation

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.databind.{JsonSerializer, SerializerProvider}
import org.apache.kafka.common.serialization.{Deserializer, Serializer}
import org.apache.kafka.streams.{KeyValue, StreamsBuilder, Topology}
import org.apache.kafka.streams.kstream._
import org.apache.kafka.streams.kstream.Materialized
import org.json.JSONObject

import scala.collection.JavaConverters.asJavaIterableConverter


object WordCount {

  def createWordCount: Topology = {

    val builder = new StreamsBuilder();

    import com.fasterxml.jackson.databind.JsonNode
    import org.apache.kafka.common.serialization.Serde
    import org.apache.kafka.common.serialization.Serdes


    val textLines: KStream[String, String] =
      builder.stream[String, String]("in")

/*
    val wordCounts = textLines
      .mapValues((v => (new JSONObject(v)).getString("text")))

//      .flatMapValues(_.toLowerCase.split("\\W+").toIterable.asJava)
      .groupBy((_, word) => word)
      .count(Named.as("scala"), Materialized.as("ScalaCount"))

    wordCounts.toStream().foreach((k, v) => println(v))
  */
    textLines.foreach((k,v) => println(v))
    textLines.to("word-count-output")

    builder.build()
  }

}
