package vmonastyrov

/**
 If the numbers 1 to 5 are written out in words: one, two, three, four, five,
 then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

 If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?

 NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115
 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance
 with British usage.
*/

fun getNumberAsWord(n: Int): String = when(n) {
    1 -> "one"
    2 -> "two"
    3 -> "three"
    4 -> "four"
    5 -> "five"
    6 -> "six"
    7 -> "seven"
    8 -> "eight"
    9 -> "nine"
    10 -> "ten"
    11 -> "eleven"
    12 -> "twelve"
    13 -> "thirteen"
    14 -> getNumberAsWord(n - 10) + "teen"
    15 -> "fifteen"
    16 -> getNumberAsWord(n - 10) + "teen"
    17 -> getNumberAsWord(n - 10) + "teen"
    18 -> "eighteen"
    19 -> getNumberAsWord(n - 10) + "teen"
    20 -> "twenty"
    30 -> "thirty"
    40 -> "forty"
    50 -> "fifty"
    60 -> getNumberAsWord(n / 10) + "ty"
    70 -> getNumberAsWord(n / 10) + "ty"
    80 -> "eighty"
    90 -> getNumberAsWord(n / 10) + "ty"
    100 -> "one hundred"
    1000 -> "one thousand"
    else -> when (n) {
        in 101..999 -> {
            val hundreds = n / 100
            if (n % 100 == 0) {
                getNumberAsWord(hundreds) + " hundred"
            } else {
                getNumberAsWord(hundreds) + " hundred and " + getNumberAsWord(n - hundreds * 100)
            }
        }
        in 21..99 -> {
            val dozens = n / 10
            getNumberAsWord(dozens*10) + "-" + getNumberAsWord(n - dozens*10)
        }
        else -> "unknown"
    }
}

fun countLetters(word: String): Int = word.trim().replace(" ", "").replace("-", "").length
