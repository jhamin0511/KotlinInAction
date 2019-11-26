package list3

fun main() {
  val set = hashSetOf(1, 7, 53)
  val list = arrayListOf(1, 7, 53)
  val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

  println(set.javaClass)
  println(list.javaClass)
  println(map.javaClass)

  println(set.javaClass.toString())
  println(list.javaClass.toString())
  println(map.javaClass.toString())

  println(set.toString())
  println(list.toString())
  println(map.toString())

  println(set)
  println(list)
  println(map)

  val strings = listOf("first", "second", "fourteenth")
  println(strings.last())

  val numbers = setOf(1, 14, 2)
  println(numbers.max())

  TestData(123, "JeongHaMIn", "sadifo")

  val list2 = listOf(1, 2, 3)
  println(list2)
}