fun main() {
    // integer
    val byte: Byte = 1;
    val short: Short = 2;
    val int: Int = 3;
    val long: Long = 4;

    // unsigned integer
    val uByte: UByte = 1u;
    val uShort: UShort = 1u;
    val uInt: UInt = 1u;
    val uLong: ULong = 1u;

    // float
    val float: Float = 1.1F;
    val double: Double = 1.2;

    // boolean
    val bool: Boolean = true;

    // string
    val char: Char = 'a';
    val string: String = "abc";

    // collection -> list
    val list = listOf(1, 2, 3);
    list.count();
    list.first();
    list.last();
    list.forEach {
        println(it);
    }

    // collection -> mutable list，多一些操作方法
    val mutableList = mutableListOf(1, 2, 3);
    mutableList.add(4);
    mutableList.remove(3)

    // collection - set
    val set: Set<Int> = setOf(1, 2, 3);
    set.first()
    set.last()
    set.count()
    set.any();
    // 还有很多好用的方法

    // collection - mutable set
    val mutableSet: MutableSet<Int> = mutableSetOf(1, 2, 3);
    mutableSet.remove(3)
    mutableSet.add(4)

    // collection - map
    val map: Map<Int, String> = mapOf(1 to "a", 2 to "b", 3 to "c");
    map.keys
    map.values
    map.containsKey(1)
    map.containsValue("a")
    map.forEach {
        println(it);
    }

    // collection - mutable map
    val mutableMap: MutableMap<Int, String> = mutableMapOf(
        1 to "a",
        2 to "b",
        3 to "c"
    )
    mutableMap.remove(1)
    // mutableMap.(4, "d")
    mutableMap[4] = "d";

}