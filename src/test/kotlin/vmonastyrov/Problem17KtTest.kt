package vmonastyrov

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

internal class Problem17KtTest {

    @Test
    fun getResult() {
        val letters = (1..1000).map(::getNumberAsWord).map (::countLetters).sum()
        println(letters)
    }

    @Test
    fun testFirstFiveNumbers() {
        var letters = (1..5).map(::getNumberAsWord).map (::countLetters).sum()
        assertEquals(19, letters)
        letters = (1..9).map(::getNumberAsWord).map (::countLetters).sum()
        assertEquals(36, letters)
        letters = (10..19).map(::getNumberAsWord).map (::countLetters).sum()
        assertEquals(70, letters)
        letters = (20..99).map(::getNumberAsWord).map (::countLetters).sum()
        assertEquals(748, letters)
        letters = (1..99).map(::getNumberAsWord).map (::countLetters).sum()
        assertEquals(854, letters)
    }


    @Test
    fun testLettersAmountWithConstants() {
        assertEquals(23, countLetters("three hundred and forty-two"))
        assertEquals(20, countLetters("one hundred and fifteen"))
    }

    @Test
    fun testLettersAmountWithGeneratedWords() {
        assertEquals(23, countLetters(getNumberAsWord(342)))
        assertEquals(20, countLetters(getNumberAsWord(115)))
    }

    @Test
    fun testGetNumberWithZero() {
        val number = getNumberAsWord(0)
        assertEquals("unknown", number)
    }

    @Test
    fun testGetNumberWithOne() {
        val number = getNumberAsWord(1)
        assertEquals("one", number)
    }

    @Test
    fun testGetNumberWithTwo() {
        val number = getNumberAsWord(2)
        assertEquals("two", number)
    }

    @Test
    fun testGetNumberWithThree() {
        val number = getNumberAsWord(3)
        assertEquals("three", number)
    }

    @Test
    fun testGetNumberWithFour() {
        val number = getNumberAsWord(4)
        assertEquals("four", number)
    }

    @Test
    fun testGetNumberWithFive() {
        val number = getNumberAsWord(5)
        assertEquals("five", number)
    }

    @Test
    fun testGetNumberWithSix() {
        val number = getNumberAsWord(6)
        assertEquals("six", number)
    }

    @Test
    fun testGetNumberWithSeven() {
        val number = getNumberAsWord(7)
        assertEquals("seven", number)
    }

    @Test
    fun testGetNumberWithEight() {
        val number = getNumberAsWord(8)
        assertEquals("eight", number)
    }

    @Test
    fun testGetNumberWithNine() {
        val number = getNumberAsWord(9)
        assertEquals("nine", number)
    }

    @Test
    fun testGetNumberWithTen() {
        val number = getNumberAsWord(10)
        assertEquals("ten", number)
    }

    @Test
    fun testGetNumberWithEleven() {
        val number = getNumberAsWord(11)
        assertEquals("eleven", number)
    }

    @Test
    fun testGetNumberWithTwelve() {
        val number = getNumberAsWord(12)
        assertEquals("twelve", number)
    }

    @Test
    fun testGetNumberWithThirteen() {
        val number = getNumberAsWord(13)
        assertEquals("thirteen", number)
    }

    @Test
    fun testGetNumberWithFourteen() {
        val number = getNumberAsWord(14)
        assertEquals("fourteen", number)
    }

    @Test
    fun testGetNumberWithFifteen() {
        val number = getNumberAsWord(15)
        assertEquals("fifteen", number)
    }

    @Test
    fun testGetNumberWithSixteen() {
        val number = getNumberAsWord(16)
        assertEquals("sixteen", number)
    }

    @Test
    fun testGetNumberWithSeventeen() {
        val number = getNumberAsWord(17)
        assertEquals("seventeen", number)
    }

    @Test
    fun testGetNumberWithEighteen() {
        val number = getNumberAsWord(18)
        assertEquals("eighteen", number)
    }

    @Test
    fun testGetNumberWithNineteen() {
        val number = getNumberAsWord(19)
        assertEquals("nineteen", number)
    }

    @Test
    fun testGetNumberWithTwenty() {
        val number = getNumberAsWord(20)
        assertEquals("twenty", number)
    }

    @Test
    fun testGetNumberWithThirty() {
        val number = getNumberAsWord(30)
        assertEquals("thirty", number)
    }

    @Test
    fun testGetNumberWithForty() {
        val number = getNumberAsWord(40)
        assertEquals("forty", number)
    }

    @Test
    fun testGetNumberWithFifty() {
        val number = getNumberAsWord(50)
        assertEquals("fifty", number)
    }

    @Test
    fun testGetNumberWithEighty() {
        val number = getNumberAsWord(80)
        assertEquals("eighty", number)
    }

    @Test
    fun testGetNumberWithSixty() {
        val number = getNumberAsWord(60)
        assertEquals("sixty", number)
    }

    @Test
    fun testGetNumberWithSeventy() {
        val number = getNumberAsWord(70)
        assertEquals("seventy", number)
    }

    @Test
    fun testGetNumberWithNinety() {
        val number = getNumberAsWord(90)
        assertEquals("ninety", number)
    }

    @Test
    fun testGetNumberWithHundred() {
        val number = getNumberAsWord(100)
        assertEquals("one hundred", number)
    }

    @Test
    fun testGetNumberWithTwoHundred() {
        val number = getNumberAsWord(200)
        assertEquals("two hundred", number)
    }

    @Test
    fun testGetNumberWithThousand() {
        val number = getNumberAsWord(1000)
        assertEquals("one thousand", number)
    }


    @Test
    fun testGetNumberWithHundredOne() {
        val number = getNumberAsWord(101)
        assertEquals("one hundred and one", number)
    }

    @Test
    fun testGetNumberWithHundredAndFortyThree() {
        val number = getNumberAsWord(143)
        assertEquals("one hundred and forty-three", number)
    }

    @Test
    fun testGetNumberWithHundredFiveHundredAndEightyNine() {
        val number = getNumberAsWord(589)
        assertEquals("five hundred and eighty-nine", number)
    }

    @Test
    fun testGetNumberAsUnknown() {
        val number = getNumberAsWord(1001)
        assertEquals("unknown", number)
    }

}
