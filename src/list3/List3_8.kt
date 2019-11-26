package list3

var StringBuilder.lastChar: Char
  get() = get(length - 1)
  set(value) {
    this.setCharAt(length - 1, value)
  }

fun main() {
  println("Kotlin".lastChar)
  val sb = StringBuilder("Kotlin?")
  sb.lastChar = '!'
  listOf(1, 2, 3, 4).max()
  println(sb.toString())
}