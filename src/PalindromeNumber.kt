/***
 * A palindrome is a number that remains
 * the same when reversed
 */
    fun main() {
        println(isPalindrome(121))
    }

    fun isPalindrome(num: Int): Boolean{
        var originalNum = num
        var reverse = 0

        while(originalNum > 0) {
            reverse = reverse * 10 + originalNum % 10
            originalNum /= 10
        }
        return num == reverse
    }

    /*
     * While loop notes
     *
     * STEP 1
     * reverse = 0 x 10 + 121 %10 = 1
     * originalNum = 12
     *
     * STEP 2
     * reverse = 1 x 10 + 12 %10 = 12
     * originalNum = 1
     *
     * * STEP 3
     * reverse = 12 x 10 + 1 %10 = 121
     * originalNum = 0
     */
