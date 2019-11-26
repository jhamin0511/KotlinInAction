package list3

fun parsePath2(path: String) {
  val regx = """(.+)/(.+)\.(.+)""".toRegex()
  val matchResult = regx.matchEntire(path)
  if (matchResult != null) {
    val (directory, filename, extension) = matchResult.destructured
    println("Dir: ${directory}, name:${filename}, ext: ${extension}")
  }
}

fun main() {
  parsePath2("/User/yole/kotlin-book/chapter.adoc")
}