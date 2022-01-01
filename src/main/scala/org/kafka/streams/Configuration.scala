package org.kafka.streams

import com.typesafe.config.{Config, ConfigFactory}

class Configuration(args: Array[String]) {

  private val map: Map[String, String] = (args.filter(_.contains("-")).map(_.replace("-", ""))
    zip args.filter(!_.contains("-"))).toMap


  private val config: Config = ConfigFactory.parseResources(map("file"))

  def getConfig: Config = config
}
