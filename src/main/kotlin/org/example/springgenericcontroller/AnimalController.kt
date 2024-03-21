package org.example.springgenericcontroller

import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping("/animals")
class AnimalController : GenericController<Animal>()