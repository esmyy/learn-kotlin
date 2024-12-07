class Contact(val id: Int, var email: String) {
    fun printId() {
        println(id)
    }
}

// Data classes，相当于是应用了一些默认规则，会比普通的类更加简洁，是特别的clas
data class User(val name: String, val id: Int)

fun main() {
    val contact = Contact(1, "mary@gmail.com")
    println(contact.email);
    println(contact.id);
    println(contact.printId());

    // data class 可以比较
    val user = User("Alex", 1)
    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    // Compares user to second user
    println("user == secondUser: ${user == secondUser}")
    // user == secondUser: true

    // Compares user to third user
    println("user == thirdUser: ${user == thirdUser}")
    // user == thirdUser: false

    val copyUser = user.copy();
    println("copyUser == user: ${copyUser == user}")
    val copyUser2 = user.copy(id = 3)
    println("copyUser2 == user: ${copyUser2 == user}")
}
