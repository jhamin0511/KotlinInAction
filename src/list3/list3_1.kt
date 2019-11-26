package list3

import list3.strings.joinToString

fun main() {
  val list = listOf(1, 2, 3)
  println(list)
  println(joinToString(list, "; ", "(", ")"))
  println(joinToString(list, separator = "; ", prefix = "(", postfix = ")"))
  println(joinToString(list, ", ", "", ""))
  println(joinToString(list))
  println(joinToString(list, ";"))
  println(joinToString(list, postfix = ";", prefix = "# "))

}