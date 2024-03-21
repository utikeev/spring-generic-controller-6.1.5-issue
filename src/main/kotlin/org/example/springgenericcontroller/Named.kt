package org.example.springgenericcontroller

interface Named {
    val name: String
}

class Person(override val name: String) : Named

class Animal(override val name: String) : Named
