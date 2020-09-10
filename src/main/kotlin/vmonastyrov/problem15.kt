package vmonastyrov

/**

Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly
6 routes to the bottom right corner.

How many such routes are there through a 20×20 grid?

**/

/**
 * Recursive solution with memoization
 */
val cache = mutableMapOf<Pointer, Long>()

data class Pointer(val row: Int, val column: Int)
class Grid(private val rows: Int, private val columns: Int) {
    fun isFinish(pointer: Pointer) = pointer.row == rows && pointer.column == columns
    fun goRight(pointer: Pointer)  = if(pointer.column == columns) null else pointer.copy(column = pointer.column + 1)
    fun goDown(pointer: Pointer)   = if(pointer.row == rows) null else pointer.copy(row = pointer.row + 1)
}

fun walkGrid(grid: Grid, pointer: Pointer?, routesAmount: Long): Long {
    if (pointer == null) { return routesAmount }

    if (cache[pointer] != null) { return cache.getValue(pointer) }

    if (grid.isFinish(pointer)) { return routesAmount + 1L }

    val res  = walkGrid(grid, grid.goRight(pointer), routesAmount) + walkGrid(grid, grid.goDown(pointer), routesAmount)
    cache[pointer] = res

    return res
}

/**
 * Dynamic programming solution
 */

fun countRoutes(m: Int, n: Int): ArrayList<ArrayList<Long>> {
    val grid = arrayListOf<ArrayList<Long>>()

    // init cells with known values how many allowed ways lead to the cell
    repeat(m + 1) {
        grid.add(it, arrayListOf(1))
    }

    repeat(n + 1) {
        grid[0].add(1)
    }

    // calculate new values for cells based on already known
    (1..m).forEach { i -> (1..n).forEach { j -> grid[i].add(grid[i - 1][j] + grid[i][j - 1])}}
    return grid
}

