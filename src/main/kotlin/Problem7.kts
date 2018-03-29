#!/usr/bin/env kscript

import java.util.*

val primes = mutableListOf<Long>()
val target = 10_001
var index:Long = 2
println("Starting computing $target primes!")
val dt = Date().toInstant().toEpochMilli()

while(primes.size != target) {
    if((index).isPrime())
        primes.add(index)
    index++
}

println("Computed $target primes..")
println("Took ${Date().toInstant().toEpochMilli() - dt}ms")
println("The ${target}st prime is ${primes.last()}")

println(primes)
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