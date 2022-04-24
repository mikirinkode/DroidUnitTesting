package com.mikirinkode.droidunittesting

import com.google.common.truth.Truth.assertThat
import org.junit.Assert.assertEquals
import org.junit.Test

class SampleFunctionTest {

    @Test
    fun `given number 8 will return 21`(){
        val result = SampleFunction.fib(9)
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
    fun `valid braces return true`(){
        val result = SampleFunction.checkBraces("(Hello)")
        assertThat(result).isTrue()
    }
}