package list3.strings

fun <T> joinToString(
  collection: Collection<T>,
  separator: String = ", ",
  prefix: String = "",
  postfix: String = ""
): String {
  val result = StringBuilder(prefix)

  for ((index, element) in collection.withIndex()) {
    if (index > 0) {
      result.append(separator)
    }
    result.append(element)
  }

  result.append(postfix)
  return result.toString()
}

fun String.lastChar(): Char = this.get(this.length - 1)

fun String.lastChar2(): Char = get(length - 1)