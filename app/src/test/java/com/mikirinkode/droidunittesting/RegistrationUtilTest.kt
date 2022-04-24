package com.mikirinkode.droidunittesting

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `empty username returns false`() {
        val result  = RegistrationUtil.validateRegistrationInput(
            "",
            "12345678",
            "12345678"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated password returns true`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "mikirinkode",
            "samplePassword",
            "samplePassword"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `username already exist returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Wafa",
            "samplePassword",
            "samplePassword"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty password returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Wafa",
            "",
            ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password was repeated incorrectly returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Wafa",
            "halo123456",
            "123456hello"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password contains less than 8 characters returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Wafa",
            "1234567",
            "1234567"
        )
        assertThat(result).isFalse()
    }
}