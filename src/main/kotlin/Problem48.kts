#!/usr/bin/env kscript

import java.math.BigInteger

val target = 1000

val answer = (1..target).map { BigInteger(it.toString()).pow(it) }.reduce { acc, bigInteger -> acc + bigInteger }.toString()
println(answer.substring(answer.length - 10))