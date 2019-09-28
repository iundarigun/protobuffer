package br.com.devcave.protobuf.producer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ProtobufProducerApplication

fun main(args: Array<String>) {
	runApplication<ProtobufProducerApplication>(*args)
}

