#!/usr/bin/env kscript

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
    if(n != 1)
        output.remove(n)
    return output;
}

val target = 28123
val abundantNumbers = mutableListOf<Int>()

val numbers = Array(target - 1) { it + 1 }.toMutableList()
for (i in 1 until target) {
    val sum = i.factors().sum()

    if(sum > i)
        abundantNumbers.add(i)
}

for (a in abundantNumbers) {
    for (b in abundantNumbers) {
        val sum = a + b
        numbers.remove(sum)
    }
}

println(numbers)

println(numbers.sum())