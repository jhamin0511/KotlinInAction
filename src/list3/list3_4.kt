package list3

fun <T> Collection<T>.joinToString(
  separator: String = ", ",
  prefix: String = "",
  postfix: String = ""
): String {
  val result = StringBuilder(prefix)

  for ((index, element) in this.withIndex()) {
    if (index > 0) {
      result.append(separator)
    }
    result.append(element)
  }

  result.append(postfix)
  return result.toString()
}

fun <T> Collection<T>.join(
  separator: String = ", ",
  prefix: String = "",
  postfix: String = ""
) = joinToString(separator, prefix, postfix)

fun Collection<String>.join2(
  separator: String = ", ",
  prefix: String = "",
  postfix: String = ""
) = joinToString(separator, prefix, postfix)

fun main() {
  val list = listOf(1, 2, 3)
  println(list)
  println(list.joinToString(separator = "; ", prefix = "(", postfix = ")"))
  println(list.joinToString(" "))
  println(list.join(" "))
  println(listOf(1, 2, 3).join())
//  println(listOf(1, 2, 3).join2())
}