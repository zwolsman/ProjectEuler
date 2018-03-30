#!/usr/bin/env kscript

import java.math.BigInteger

val size:Long = 20
val n:Long = size*2

val answer = (n.`!` / ((n - size).`!` * size.`!`))
println(answer)

fun factorial(num: Long) : BigInteger = if(num == 0.toLong()) BigInteger.ONE else BigInteger.valueOf(num) * factorial(num - 1)

val Long.`!`: BigInteger
    get() = factorial(this)
