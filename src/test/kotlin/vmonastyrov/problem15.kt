package vmonastyrov

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.math.BigDecimal
import kotlin.system.measureTimeMillis

/**

Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly
6 routes to the bottom right corner.

How many such routes are there through a 20×20 grid?

**/

class Problem15Test {
    @Test
    fun walkingTest() {
        val grid = Grid(2, 2)
        val routes = walkGrid(grid, Pointer(0, 0), 0)
        Assertions.assertEquals(6, routes)
    }

    @Test
    fun getResult() {
        val grid = Grid(20, 20)
        val exTime = measureTimeMillis {
            val routes = walkGrid(grid, Pointer(0, 0), 0)
            println("Routes = $routes")
        }
        println("Execution time: ${exTime} ms")
    }
}