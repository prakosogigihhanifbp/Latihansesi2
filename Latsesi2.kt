fun main(args: Array<String>) {
    for (a in 1..100)
        when (a % 2) {
            1 -> println(a)
            0 -> if (a % 10 == 0)
                println("$a angka kelipatan 10")
            else
                println("$a angka genap")
        }
}