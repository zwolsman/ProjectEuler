#!/usr/bin/env kscript

print((0 until 1000).filter { it % 3 == 0 || it % 5 == 0 }.sum())