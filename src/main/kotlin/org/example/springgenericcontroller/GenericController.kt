package org.example.springgenericcontroller

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
abstract class GenericController<T : Named> {
    @PostMapping("/name")
    fun getName(@RequestBody item: T): String {
        return item.name
    }
}