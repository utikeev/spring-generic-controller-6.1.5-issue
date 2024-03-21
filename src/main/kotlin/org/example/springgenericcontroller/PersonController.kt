package org.example.springgenericcontroller

import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping("/people")
class PersonController : GenericController<Person>()