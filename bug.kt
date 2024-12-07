fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println(list)
}
This code attempts to remove even numbers from a list. However, modifying a list while iterating over it using removeIf can lead to unexpected behavior, particularly if the removal affects the index of subsequent elements.  The list might not be fully processed as expected.