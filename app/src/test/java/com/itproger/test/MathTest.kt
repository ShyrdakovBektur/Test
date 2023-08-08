package com.itproger.test

import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class MathTest {
    private var math: Math? = null

    @Before
    fun setUp() {
        math = Math()
    }

    @Test
    fun testSimpleAddition() {
        Assert.assertEquals("5", math?.add("2", "3"))
    }

    @Test
    fun testDoubleAddition() {
        Assert.assertEquals("7", math?.add("3.5", "3.5"))
    }

    @Test
    fun testDoubleAdditionWithDecimal() {
        Assert.assertEquals("5.2", math?.add("2.0", "3.2"))
    }

    @Test
    fun testDoubleDotInNumber() {
        Assert.assertEquals("You entered two dots!", math?.add("2..2", "3"))
    }

    @Test
    fun testInvalidInput() {
        Assert.assertEquals("Invalid input!", math?.add("2zxcvb3", "3"))
    }

    @Test
    fun testEmptyInput() {
        Assert.assertEquals("You did not fill in the fields!", math?.add("", "3"))
    }

    @Test
    fun testDoubleSpaceInInput() {
        Assert.assertEquals("37", math?.add("2", "35"))
    }

    @Test
    fun testSimpleDivision() {
        Assert.assertEquals("4", math?.divide("8", "2"))
    }

    @Test
    fun testDivisionZero() {
        Assert.assertEquals("Cannot divide by zero!", math?.divide("8", "0"))
    }

    @Test
    fun testAdditionalAddition() {
        Assert.assertEquals("15", math?.add("7", "8"))
    }

    @Test
    fun testNegativeAddition() {
        Assert.assertEquals("5", math?.add("-2", "7"))
    }

    @Test
    fun testDecimalDivision() {
        Assert.assertEquals("1.5", math?.divide("3.0", "2"))
    }

    @After
    fun tearDown() {
        math = null
    }
}
