package de.mudbyte.de.autokrat.backend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AutokratBackendApplication

fun main(args: Array<String>) {
	runApplication<AutokratBackendApplication>(*args)
}
