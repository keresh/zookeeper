const val NUM_ZERO = 0
const val NUM_ONE = 1
const val NUM_NINE = 9
const val NUM_TEN = 10
const val NUM_NINETY_NINE = 99
const val NUM_HUNDRED = 100

fun main() {
    val numbers = MutableList(NUM_HUNDRED) { NUM_ZERO }
    numbers[NUM_ZERO] = NUM_ONE
    numbers[NUM_NINE] = NUM_TEN
    numbers[NUM_NINETY_NINE] = NUM_HUNDRED
    // do not touch the lines below
    println(numbers.joinToString())
}