fun main() {
    val words = getUserInput()
    val wordGroups = words.groupBy { it.toCharArray().sorted().joinToString("") }
    printWordGroups(wordGroups)
}

fun getUserInput(): List<String> {
    println("Введите слова (разделяя их пробелами):")
    return readLine()?.split(" ") ?: emptyList()
}

fun printWordGroups(wordGroups: Map<String, List<String>>) {
    wordGroups.values.forEach { println(it.joinToString(", ")) }
}