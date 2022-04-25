package com.mikirinkode.droidunittesting.video3

object RegistrationUtil {

    private val existingUsers = listOf<String>("Wafa", "Ausath")

    /**
     * the input is not valid if...
     * ...the username/password is empty
     * ...the username is already taken
     * ...the confirmed password not same as the real password
     * ...the password contains less than 8 characters
     */
    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmedPassword: String
    ): Boolean {
        if (username.isEmpty() || password.isEmpty()){
            return false
        }
        if (username in existingUsers){
            return false
        }
        if (password.length < 8){
            return false
        }
        if (confirmedPassword != password){
            return false
        }
        return true
    }
}