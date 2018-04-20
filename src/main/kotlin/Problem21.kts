fun Int.factors() : Set<Int> {
    var i = 1
    val n = this
    val output = mutableSetOf<Int>()
    while (i <= Math.sqrt(n.toDouble())) {
        if (n % i == 0) {
            if (n / i == i) {
                output.add(i)
            } else {
                output.add(i)
                output.add(n/i)
            }
        }
        i++
    }
    if(n != 1)
        output.remove(n)
    return output;
}


val target = 10_000
var sum = 0
for (a in 1 until target) {
    val f1 = a.factors().sorted()
    val b = f1.sum()
    val f2 = b.factors().sorted()
    val sum2 = f2.sum()


    if(sum2 == a && a != b) {
        sum += a
    }

}
println(sum)