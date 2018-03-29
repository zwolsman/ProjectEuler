#!/usr/bin/env kscript

val target = 1000000


var winner = listOf<Long>()
for(index in 1 until target) {
   val temp = index.collatzSequence()
    if(temp.size > winner.size) {
        winner = temp
    }
}

println("Found a winner with a length of ${winner.size}")
println("The number is ${winner.first()}")

fun Int.collatzSequence() : List<Long> {
    var n = this.toLong()
    val seq = mutableListOf(n)
    do {
        if (n.isEven)
                n /= 2
            else
                n = 3 * n + 1
        seq.add(n)
    } while(n != 1.toLong())
    return seq
}

private val Long.isEven: Boolean
    get() = this % 2 == 0.toLong()
