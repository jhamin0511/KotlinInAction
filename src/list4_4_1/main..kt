package list4_4_1

import java.io.File

fun main() {
  println(CaseInsensitiveFileComparator.compare(File("/User"), File("/User")))

  val files = listOf(File("/z"), File("/a"))
  println(files.sortedWith(CaseInsensitiveFileComparator))

  val persons = listOf(Person("Bob"),Person("Alice"))
  println(persons.sortedWith(Person.NameComparator))
}