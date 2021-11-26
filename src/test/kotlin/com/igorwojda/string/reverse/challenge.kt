package com.igorwojda.string.reverse

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun reverse(str: String): String {
    var reversedString = ""
    (str.length - 1 downTo 0).forEach {
        reversedString += str[it]
    }
    return reversedString
}

private class Test {
    @Test
    fun `Reverse of "" is ""`() {
        reverse("") shouldBeEqualTo ""
    }

    @Test
    fun `Reverse of "a!32a" is "a23!a"`() {
        reverse("a!32a") shouldBeEqualTo "a23!a"
    }

    @Test
    fun `Reverse of "abcd" is "dcba"`() {
        reverse("abcd") shouldBeEqualTo "dcba"
    }

    @Test
    fun `Reverse of "aabbccdd" is "ccbbaadd"`() {
        reverse("aabbccdd") shouldBeEqualTo "ddccbbaa"
    }
}
