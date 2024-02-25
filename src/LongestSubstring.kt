fun main() {
    println(getLongestStrings("abcabcbb"))


}

/****
 * Use sliding window  starting at 0
 * For each sliding widow, create a set
 * for each element in the sliding window,
 * check to see if it's the set,
 * if yes,don't expand if no, expand
 */
    fun getLongestString(text: String): Int{
        var longestString = ""
        for(char in text){
            for(j in char + 1 until Char.MAX_VALUE){
                if(char !=  j){
                    longestString + char
                }
            }
        }
        return longestString.length
    }

fun getLongestStrings(s: String): Int{
    val set = HashSet<Char>()
    var length = 0
    val sArray = s.toCharArray()
    var left = 0

    for (right in 0 until sArray.size){
        val current = sArray[right]
        while(set.contains(current) && left < right){
            set.remove(sArray[left++])
        }
        set.add(current)
        length = Math.max(length, (right - left) + 1)
    }
    return length
}

