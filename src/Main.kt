fun main() {
    var arrayList : IntArray = intArrayOf(2,7,11,15)
    println(hasEvenNumber(arrayList))

    println((getTargetSum(arrayList, 9)).toList())
}
fun checkPalindrome(x: Int): Boolean{
    if (x < 0) {
        return false
    }
    // Store the number in a variable
    var number = x
    // This will store the reverse of the number
    var reverse = 0
    while (number > 0) {
        reverse = reverse * 10 + number % 10
        number /= 10
    }
    return x == reverse
}

fun hasEvenNumber(nums: IntArray) : Int {
    var evenNum : Int = 0
    if(nums.size == 0){
        return 0
    }
    for(i in nums){
        if( i.toString().length %2 == 0){
            evenNum++
        }
    }
    return evenNum
}

fun twoSum(nums: IntArray, target: Int): IntArray {
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

fun getTargetSum(nums: IntArray, target: Int): IntArray{
    for(i in 0 until nums.size){
        for(j in i + 1 until nums.size){
            if((nums[i] + nums[j]) == target){
                return intArrayOf(i,j)
            }
        }
    }
    return intArrayOf()
}

