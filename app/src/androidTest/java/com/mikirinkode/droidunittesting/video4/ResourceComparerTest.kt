package com.mikirinkode.droidunittesting.video4

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import com.mikirinkode.droidunittesting.R
import org.junit.After
import org.junit.Before

import org.junit.Test

class ResourceComparerTest {

    /**
     * Bad approach
     */
//    private val resourceComparer = ResourceComparer()

    /**
     * Best approach
     */
    private lateinit var resourceComparer: ResourceComparer

    // Best approach
    @Before
    fun setup(){
        resourceComparer = ResourceComparer()
    }

    /**
     * After function
     * can be used to close database, if  you're testing it
     */
    @After
    fun teardown(){

    }

    @Test
    fun stringResourceSameAsGivenString_returnsTrue(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context, R.string.app_name, "DroidUnitTesting")
        assertThat(result).isTrue()
    }

    @Test
    fun stringResourceDifferentAsGivenString_returnsFalse(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context, R.string.app_name, "DroidUnitTestingFalse")
        assertThat(result).isFalse()
    }
}