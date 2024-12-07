interface MyInterface {
    val prop: Int;

    val propertyWithImplementation: String
        get() = "foo"

    fun bar()
    fun foo() {
        // optional body
    }

    fun print() {
        println(prop)
    }
}

class Child: MyInterface {
    override fun bar {
        // implementation
    }
}