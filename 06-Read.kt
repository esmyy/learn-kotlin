fun main() {
    println("Please enter")
    val name = readLine()
    println("Hello $name")
    println("Please enter a number")
    val number = readLine()?.toInt()
    println("You entered $number")

    // if not available, return null
    val number2 = readln().toIntOrNull()
    println("You entered $number2")
}

