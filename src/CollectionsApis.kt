/***
 * Kotlin collection Apis:
 * Lists, Maps & Sets
 */

/***
 * Kotlin collection operators:
 * in, + & -
 */

/***
 * Kotlin collection functions:
 * Slicing, Removing,Filtering, Dropping,
 * Grouping, Mapping, Reduction, Chucking & Windowing
 */
fun main() {
    println(mapItems(listOf(1, 2, 3, 4, 5, 6)))
    println(foldList(listOf(1, 2, 3, 4, 5, 6)))
    println(reduceList(listOf(1, 2, 3, 4, 5, 6)))
    println( createChunkedCollection(listOf(1, 2, 3, 4, 5, 6)).toList())
    println((createSlidingWindow((1..6).toList())).toList())
}

/***
 * Reduction in Kotlin. Using fold/reduce operations
 * fold() takes an initial value and uses it as the accumulated value on the first step.
 * Returns the initial value in case the collection was empty
 *
 * reduce() uses the first and the second elements as operation arguments on the first step.
 * Throws an UnsupportedOperationException if the collection was empty
 * E.g. Exception in thread "main" java.lang.UnsupportedOperationException: Empty collection can't be reduced.
 */


/***
 * Mapping in Kotlin.
 */

fun mapItems(elementsList: List<Int>):List<Int>{
    return elementsList.map{ it * it }
}

fun foldList(elementsList: List<Int>):Int{
    return elementsList.fold(0, {x, i -> x + (i * i)})
}

fun reduceList(elementsList: List<Int>):Int{
    return elementsList.reduce { x, i-> x + i}
}

/***
 * Chunking in Kotlin. Breaking a collection into chunks
 * E.g. [[1, 2], [3, 4], [5, 6]]
 */

fun createChunkedCollection(elementsList: List<Int>):List<List<Int>>{
    return elementsList.chunked(2)
}
/***
 * Windowing in Kotlin. A technique showing how windowed() function returns
 * a list of element ranges by moving a sliding window.
 * returned value looks like e.g. [[1, 2, 3], [2, 3, 4], [3, 4, 5], [4, 5, 6]]
 */

fun createSlidingWindow(elementsList: List<Int>) : List<List<Int>> {
    return elementsList.windowed(3)
}