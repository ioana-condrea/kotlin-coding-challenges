package com.igorwojda.integer.factorial

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private tailrec fun factorial(n: Int, acc: Int=1): Int {
    // fold() solution runs in 22ms
    // return (1..n).toList().fold(1) { acc, i -> acc * i }

    // Recursive solution runs in 16ms
    /* if (n==0) return 1
    return if(n==1) n
    else n * factorial(n-1) */

    // Tail rec solution runs in 19ms
    // Obs: it needed an additional parameter to pass the result in order to work as tail rec function
    return if(n==0) return acc else factorial(n-1, n*acc)
}

class RecursiveFactorial {
    @Test
    fun `factorial 0 should equal 1`() {
        factorial(0) shouldBeEqualTo 1
    }

    @Test
    fun `factorial 3 should equal 6`() {
        factorial(3) shouldBeEqualTo 6
    }

    @Test
    fun `factorial 5 should equal 120`() {
        factorial(5) shouldBeEqualTo 120
    }

    @Test
    fun `factorial 10 should equal 3628800`() {
        factorial(10) shouldBeEqualTo 3628800
    }
}
