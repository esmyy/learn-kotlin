fun main() {
    // not allowed to be null
    var notNullableString: String = "not null"
    // notNullableString = null // will throw an error

    // null
    var nullableString: String? = "nullable"
    nullableString = null
    if (nullableString != null) {
        println(nullableString.length)
    } else {
        println("nullableString is null")
    }

    // safety check
    println(nullableString?.length ?: "nullableString is null so no length")
}
