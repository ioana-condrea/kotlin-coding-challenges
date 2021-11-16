package com.igorwojda.integer.power

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

// infix fun Int.`^`(exponent: Int): Int = toDouble().pow(exponent).toInt()

private fun power(base: Int, exponent: Int): Int {
    //val times: (Int, Int) -> Int = Int::times
    return List(exponent){base}.reduce(Int::times)
    // return base `^` exponent
}

private class Test {
    @Test
    fun `power 2^1 returns 2`() {
        power(2, 1) shouldBeEqualTo 2
    }

    @Test
    fun `power 2^2 returns 2`() {
        power(2, 2) shouldBeEqualTo 4
    }

    @Test
    fun `power 2^3 returns 8`() {
        power(2, 3) shouldBeEqualTo 8
    }

    @Test
    fun `power 3^4 returns 81`() {
        power(3, 4) shouldBeEqualTo 81
    }
}
