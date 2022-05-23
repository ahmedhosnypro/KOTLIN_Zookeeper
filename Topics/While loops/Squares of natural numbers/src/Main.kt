fun main() {
    val bound = readln().toInt()
    var num = 1
    while (num * num <= bound) {
        println(num * num)
        num++
    }
}