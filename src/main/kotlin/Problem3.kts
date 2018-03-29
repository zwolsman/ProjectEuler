#!/usr/bin/env kscript

val target = 600851475143
var temp = target

var answer:Long = 0
var i:Long = 2
while(temp > 1) {
    if(!i.isPrime()) {
        i++
        continue
    }

    if(temp % i == 0.toLong()) {
        temp /= i
        answer = i
        i = 2
    } else {
        i++
    }
}

println("Answer: $answer")

fun Long.isPrime() :Boolean {
    if(this == 2.toLong())
        return true
    val zero:Long = 0
    for(i in this - 1 downTo 2) {
        if (this % i == zero)
            return false
    }

    return true
}