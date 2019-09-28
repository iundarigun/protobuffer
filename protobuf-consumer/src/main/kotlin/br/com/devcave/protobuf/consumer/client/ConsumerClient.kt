package br.com.devcave.protobuf.consumer.client

import br.com.devcave.protobuf.ProtoTest
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(value="consumer-client", url="http://localhost:8080")
interface ConsumerClient {
    @GetMapping("/teams")
    fun getTeams(): ProtoTest.Team

}