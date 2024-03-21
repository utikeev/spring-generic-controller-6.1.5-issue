package org.example.springgenericcontroller

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.server.LocalServerPort

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SpringGenericControllerApplicationTests {
    @LocalServerPort
    private var port: Int = 0

    @Autowired
    private lateinit var restTemplate: TestRestTemplate

    @Test
    fun `should return name`() {
        assertThat(
            restTemplate.postForObject("http://localhost:$port/people/name", Person("John"), String::class.java)
        ).isEqualTo("John")
        assertThat(
            restTemplate.postForObject("http://localhost:$port/animals/name", Animal("Dog"), String::class.java)
        ).isEqualTo("Dog")
    }
}
