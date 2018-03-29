import kotlin.math.roundToInt
import kotlin.math.sqrt

object PrimeUtils {
    fun eratosthenesSieve(max: Long) : List<Long> {
        val arr = (0 until max).map { true }.toTypedArray()
        arr[1] = false

        for (i in 2 until sqrt(max.toDouble()).roundToInt()) {
            if (arr[i])
            {
                var j = i*i
                while(j < max) {
                    arr[j] = false
                    j += i
                }
            }
        }

        return arr.mapIndexedNotNull { index, b -> if(b) index.toLong() else null }
    }
}