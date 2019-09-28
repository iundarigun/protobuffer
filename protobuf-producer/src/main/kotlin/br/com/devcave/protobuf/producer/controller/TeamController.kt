package br.com.devcave.protobuf.producer.controller

import br.com.devcave.protobuf.producer.ProtoTest
import org.springframework.http.HttpEntity
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TeamController {

    @GetMapping("teams")
    fun getTeams(): HttpEntity<ProtoTest.Team> {

        return ResponseEntity.ok(getFakeTeam())
    }

    private fun getFakeTeam(): ProtoTest.Team {
        return ProtoTest.Team.newBuilder()
            .setId(1)
            .setTeamName("Delta")
            .addAllEmployee(createEmployees().asList())
            .build()
    }

    private fun createEmployees(): Array<ProtoTest.Employee> {
        return arrayOf(
            ProtoTest.Employee.newBuilder()
                .setId(1)
                .setEmail("iundarigun@iunda")
                .setFirstName("Oriol")
                .setLastName("Canalias")
                .setJob(ProtoTest.Employee.JobType.DEV)
                .build()
        )
    }
}