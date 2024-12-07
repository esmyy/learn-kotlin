fun main() {
    foo();
    println( sum(1,2))
    lambda()
    lambda2();
}

fun foo() {
    println("foo")
    // if no return, return will be Unit
    // so what is Unit ? so different with other languages
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun lambda() {
    val upperCaseString = { text: String -> text.uppercase() }
    println(upperCaseString("hello"))
}

fun lambda2() {
    val list = listOf(1, 2, 3, 4, -5);
    val isNegative = { x: Int -> x < 0}
    val filteredList = list.filter(isNegative)
    println(filteredList)
}