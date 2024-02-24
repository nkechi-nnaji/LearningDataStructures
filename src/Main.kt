fun main() {
    var arrayList : IntArray = intArrayOf(2,7,11,15)
    println(hasEvenNumber(arrayList))


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


