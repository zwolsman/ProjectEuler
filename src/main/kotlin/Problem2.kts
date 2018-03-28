var current = 0
var last = 1
val target = 4_000_000
var sum = 0
while(current < target) {
    val temp = current
    current += last
    last = temp
    if(current % 2 == 0)
        sum += current
}

print(sum)