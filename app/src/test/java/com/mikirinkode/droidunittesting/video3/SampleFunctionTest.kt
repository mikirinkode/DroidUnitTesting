package com.mikirinkode.droidunittesting.video3

import com.google.common.truth.Truth.assertThat
import com.mikirinkode.droidunittesting.video3.SampleFunction
import org.junit.Assert.assertEquals
import org.junit.Test

class SampleFunctionTest {

    @Test
    fun `given number 7 will return 13`(){
        val result = SampleFunction.fib(7)
        assertEquals(13, result)
    }

    @Test
    fun `given number 8 will return 21`(){
        val result = SampleFunction.fib(8)
        assertEquals(21, result)
    }

    @Test
    fun `invalid braces return false`(){
        val result = SampleFunction.checkBraces("((Hello)")
        assertThat(result).isFalse()
    }

    @Test
    fun `another invalid braces return false`(){
        val result = SampleFunction.checkBraces("(Hello))")
        assertThat(result).isFalse()
    }

    @Test
    fun `invalid braces order return false`(){
        val result = SampleFunction.checkBraces("Hello)(")
        assertThat(result).isFalse()
    }

    @Test
    fun `another invalid braces order return false`(){
        val result = SampleFunction.checkBraces(")(Hello")
        assertThat(result).isFalse()
    }

    @Test
    fun `valid braces return true`(){
        val result = SampleFunction.checkBraces("(Hello)")
        assertThat(result).isTrue()
    }
}