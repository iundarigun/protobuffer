package br.com.devcave.protobuf.consumer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@EnableFeignClients
@SpringBootApplication
class ProtobufConsumerApplication

fun main(args: Array<String>) {
	runApplication<ProtobufConsumerApplication>(*args)
}
