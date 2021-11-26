package com.igorwojda.string.maxchar

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun maxOccurrentChar(str: String): Char? {
    if (str.isEmpty()) return null
    var (mostUsedChar, mostUsedCharCounter) = Pair(' ', 0)
    str.forEach { char ->
        val currentCharCounter = str.filter { c -> c == char }.length
        if (currentCharCounter > mostUsedCharCounter) {
            mostUsedChar = char
        }
        mostUsedCharCounter = currentCharCounter
    }
    return mostUsedChar
}

private class Test {
    @Test
    fun `Don't find a char in empty string`() {
        maxOccurrentChar("") shouldBeEqualTo null
    }

    @Test
    fun `Finds char 'a' in string "a"`() {
        maxOccurrentChar("a") shouldBeEqualTo 'a'
    }

    @Test
    fun `Finds char 'a' in string "abcdefghijklmnaaaaa"`() {
        maxOccurrentChar("abcdefghijklmnaaaaa") shouldBeEqualTo 'a'
    }

    @Test
    fun `Finds char '1' in string "ab1c1d1e1f1g1"`() {
        maxOccurrentChar("ab1c1d1e1f1g1") shouldBeEqualTo '1'
    }
}
