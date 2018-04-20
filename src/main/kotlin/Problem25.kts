import java.math.BigInteger


var result = BigInteger.ZERO
var  next = BigInteger.ONE
var index = 0
while(next.toString().length != 1000) {
    println("$result -> $index")
    val temporary = result
    result = next
    next = temporary + next
    index++
}

println(index)