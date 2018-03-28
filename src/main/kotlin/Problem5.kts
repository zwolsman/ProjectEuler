val divisionMax = 20
var index = 0

while(!index.isEvenlyDivisibleBy(divisionMax))
    index++

println("Answer: $index")

fun Int.isEvenlyDivisibleBy(max: Int) : Boolean {
    if(this < max) return false

    for(i in 1..max) {
        if(this % i != 0)
            return false
    }
    return true
}