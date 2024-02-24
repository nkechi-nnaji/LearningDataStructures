
fun main() {
    //contentToString() or toList() can be used to print out value
    println(getTwoSum(intArrayOf(2,9,8,13,4,5), 9).toList())
}

/***
 * In an array list the addition of the value of two indices
 * should return the same number
 * as the target
 */
fun getTwoSum(nums: IntArray, target: Int): IntArray{
    for(i in 0 until nums.size){
        for(j in i + 1 until nums.size){
            if((nums[i] + nums[j]) == target){
                return intArrayOf(i, j)
            }
        }
    }
    throw IllegalArgumentException("No solution")
}

fun getTwoSumHashMap(nums: IntArray, target: Int): IntArray {
    val map = HashMap<Int, Int>()
    nums.forEachIndexed { idx, item ->
        val found = map[target - item]
        found?.let {
            return intArrayOf(found, idx)
        }
        map[item] = idx
    }
    throw IllegalArgumentException("No solution")
}