fun main() {    
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toMutableList()
    // Do not touch lines above
    // Write only exchange actions here.
    val tempNumber = numbers[0]
    numbers[0] = numbers[numbers.lastIndex]
    numbers[numbers.lastIndex] = tempNumber
    // Do not touch lines below
    println(numbers.joinToString(separator = " "))
}