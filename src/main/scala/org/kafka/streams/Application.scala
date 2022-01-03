package org.kafka.streams

import org.apache.kafka.clients.consumer.ConsumerConfig
import org.apache.kafka.common.serialization.Serdes
import org.apache.kafka.streams.{KafkaStreams, StreamsConfig}
import org.kafka.streams.transformation.WordCount
import org.slf4j.LoggerFactory

import java.time.Duration
import java.util.Properties



object Application extends App {
  val log = LoggerFactory.getLogger(this.getClass)
  val config = new Configuration(args)
  log.info("Application")
  val kafkaConfig = KafkaConfig(config.getConfig)



  val streams = new KafkaStreams(WordCount.createWordCount, kafkaConfig.properties)

  streams.start()

  sys.ShutdownHookThread {
    streams.close(Duration.ofSeconds(10))
  }
}
