#!/usr/bin/env kscript

var i = 1
val target = 500
var number = 0

do {
    number += i++
    val factors = number.factors()
    if(factors.size > target) {
        println("$number -> ${factors.sorted()}")
        break
    }
}while(true)


fun Int.factors() : Set<Int> {
    var i = 1
    val n = this
    val output = mutableSetOf<Int>()
    while (i <= Math.sqrt(n.toDouble())) {
        if (n % i == 0) {
            if (n / i == i) {
                output.add(i)
            } else {
                output.add(i)
                output.add(n/i)
            }
        }
        i++
    }
    return output;
}