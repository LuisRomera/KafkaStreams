package org.kafka.streams

import com.typesafe.config.Config
import org.apache.kafka.clients.consumer.ConsumerConfig
import org.apache.kafka.common.serialization.Serdes
import org.apache.kafka.streams.StreamsConfig
import org.kafka.streams.Application.config

import java.util.Properties

case class KafkaConfig(getConfig: Config) {
  val properties = new Properties()
  properties.put(StreamsConfig.APPLICATION_ID_CONFIG, config.getConfig.getString("name"))
  properties.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, config.getConfig.getString("kafka.bootstrapservers"))
  properties.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, config.getConfig.getString("kafka.auto-offset-reset"))
  properties.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass)
  properties.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass)

}
