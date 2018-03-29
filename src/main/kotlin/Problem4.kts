#!/usr/bin/env kscript

var highest = -1
for(x in 100 until 1000) {
    for(y in 100 until 1000) {
        val sum = x * y
        if(sum.isPalindrome() && sum > highest)
            highest = sum
    }
}

println(highest)


fun Int.isPalindrome() : Boolean {
    return this.toString() == this.toString().reversed()
}