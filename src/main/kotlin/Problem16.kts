#!/usr/bin/env kscript

import java.math.BigInteger

val answer = BigInteger("2").pow(1000).toString().chunked(1).map { it.toInt() }.sum()
println(answer)

