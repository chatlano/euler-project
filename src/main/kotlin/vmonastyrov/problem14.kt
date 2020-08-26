package vmonastyrov

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

tailrec fun getSequenceLength(n: Long, step: Int): Int = if (n == 1L) step else when(n % 2L) {
            0L ->  getSequenceLength(n / 2, step + 1)
            else -> getSequenceLength(3*n + 1, step + 1)
        }

fun calcSizes(from: Long, to: Long): List<Int> = (from..to).map { getSequenceLength(it, 1) }