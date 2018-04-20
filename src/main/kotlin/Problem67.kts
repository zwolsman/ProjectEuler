#!/usr/bin/env kscript

import java.io.InputStreamReader
import java.net.URL

val link = "https://projecteuler.net/project/resources/p067_triangle.txt"
val stream = URL(link).openStream()
val raw = InputStreamReader(stream).readText()
val temp = raw
        .split("\n")
        .map { it.trim() }
        .filter { it.isNotBlank() }
        .map {
            it.split(' ').map { it.toInt() }
        }
val maxLength = temp.maxBy { it.size }!!.size
var triangle = temp.map {
    Array(maxLength) { index ->
        it.getOrElse(index) {
            0
        }
    }.toMutableList()
}

val paths = listOf(0, 1)
while (triangle.size > 1) {

    val row = triangle[triangle.size - 2]
    val optionRow = triangle[triangle.size - 1]
    for ((index, cell) in row.withIndex()) {
        val options = paths
                .map {
                    index + it
                }
                .filter {
                    it >= 0 && it < optionRow.size
                }.map {
                    optionRow[it]
                }
        row.set(index, cell + options.max()!!)
    }
    triangle = triangle.subList(0, triangle.size - 1)
}
println(triangle.first().max())