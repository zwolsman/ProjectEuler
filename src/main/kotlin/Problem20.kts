#!/usr/bin/env kscript

import java.math.BigInteger

fun factorial(num: Long) : BigInteger = if(num == 0.toLong()) BigInteger.ONE else BigInteger.valueOf(num) * factorial(num - 1)

val answer = factorial(100).toString().chunked(1).map { it.toInt() }.sum()

println(answer)