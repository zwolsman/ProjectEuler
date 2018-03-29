val target:Long = 2_000_000

val sum = (target downTo 0).filter { it.isPrime() }.sum()

println(sum)


fun Long.isPrime() :Boolean {
    val zero:Long = 0

    if(this == 2.toLong())
        return true
    if(this == 1.toLong() || this == zero)
        return false

    if(this % 2 == zero)
        return false

    for(i in 3 until this) {
        if (this % i == zero)
            return false
    }
    return true
}