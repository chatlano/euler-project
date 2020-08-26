package vmonastyrov

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

/**

The following iterative sequence is defined for the set of positive integers:

n → n/2 (n is even)
n → 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:
13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1

It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.

**/

class Problem14Test {

    @Test
    fun testSequence() {
        Assertions.assertEquals(10, getSequenceLength(13, 1))
    }

    @Test
    fun calc() {
        val sizes = calcSizes(500000, 1000000)
        val max = sizes.maxOrNull()
        if (max != null) {
            val v = sizes.indexOf(max)
            println("$max ${v + 500000}")
        }
    }
}