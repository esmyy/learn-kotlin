fun main() {
    val a = 3
    if (a == 1) {
        println("a is 1")
    } else {
        println("a is not 1")
    }

    // when 就是 Switch case，不只是
    when (a) {
        1 -> println("a is 1")
        2 -> println("a is 2")
        else -> println("a is not 1 or 2")
    }

    val result = when (a) {
        1 -> "a is 1"
        2 -> "a is 2"
        else -> "a is not 1 or 2"
    }

    println(result)

    // for
    for (i in 1..5) {
        println(i)
    }
    val cake = listOf("cake", "pie")
    for (item in cake) {
        println(item)
    }

    // while
    var num = 1;
    while (num < 5) {
        println(num)
        num++
    }

    // do while
    do {
        println(num)
        num++
    } while (num < 5)
}