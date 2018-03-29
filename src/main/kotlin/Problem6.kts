#!/usr/bin/env kscript

import java.lang.Math.pow
import kotlin.math.abs

val target = 100
val sumSquare = (0..target).sumBy { it * it }.toDouble()
val squareSum = pow((0..target).sum().toDouble(), 2.0)
val diff = abs(sumSquare - squareSum).toInt()

println("diff: $diff")
