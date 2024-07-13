package advanced

import org.example.advanced.Calculate
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class CalculateTest {
    private val calculate: Calculate = Calculate()

    @Test
    fun sum() {
        val expectedResult = 10
        assertEquals(expectedResult, calculate.sum(5, 5))

    }
}