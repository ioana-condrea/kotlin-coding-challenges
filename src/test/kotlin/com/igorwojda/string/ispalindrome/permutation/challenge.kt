package com.igorwojda.string.ispalindrome.permutation

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun isPermutationPalindrome(str: String): Boolean {
    var oneCharAlreadyEncountered = false
    str.forEach { char ->
        val charCount = str.filter { c ->
            c == char
        }.length

        if (charCount == 1 && !oneCharAlreadyEncountered) {
            oneCharAlreadyEncountered = true
        } else if (charCount == 1 && oneCharAlreadyEncountered) {
            return false
        }
        if (charCount > 2 && charCount % 2 != 0) {
            return false
        }
    }
    return true
}

private class Test {
    @Test
    fun `"gikig" is a palindrome`() {
        isPermutationPalindrome("gikig") shouldBeEqualTo true
    }

    @Test
    fun `"ookvk" is a palindrome`() {
        isPermutationPalindrome("ookvk") shouldBeEqualTo true
    }

    @Test
    fun `"sows" is a palindrome`() {
        isPermutationPalindrome("sows") shouldBeEqualTo false
    }

    @Test
    fun `"tami" is a palindrome`() {
        isPermutationPalindrome("tami") shouldBeEqualTo false
    }

    @Test
    fun `"aaaa" is a palindrome`() {
        isPermutationPalindrome("aaaa") shouldBeEqualTo true
    }

    @Test
    fun `"aabcaa" is a palindrome`() {
        isPermutationPalindrome("aabcaa") shouldBeEqualTo false
    }

    @Test
    fun `"aabbbbaa" is a palindrome`() {
        isPermutationPalindrome("aabbbbaa") shouldBeEqualTo true
    }
}
