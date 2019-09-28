package br.com.devcave.protobuf.consumer.controller

import br.com.devcave.protobuf.consumer.client.ConsumerClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ConsumerController(val consumerClient: ConsumerClient) {

    @GetMapping("test")
    fun getTeams(): String {
        val team = consumerClient.getTeams()
        return team.teamName
    }
}