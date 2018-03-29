#!/usr/bin/env kscript
//INCLUDE utils/PrimeUtils.kt

val target:Long = 2_000_000


val sum = PrimeUtils.eratosthenesSieve(target).sum()
println(sum)