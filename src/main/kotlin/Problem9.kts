for(a in 1 until 1000) {
    for(b in 1 until 1000) {
        for(c in 1 until 1000) {
            if(a + b + c != 1000)
                continue

            if((a*a) + (b*b) == (c*c)) {
                println("Found it! $a, $b, $c")
                println("Product: ${a*b*c}")
            }
        }
    }
}