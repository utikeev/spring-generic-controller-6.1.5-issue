package org.example.springgenericcontroller

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class SpringGenericControllerApplication {
    @Bean
    fun animalController() = AnimalController()

    @Bean
    fun personController() = PersonController()
}

fun main(args: Array<String>) {
    runApplication<SpringGenericControllerApplication>(*args)
}
