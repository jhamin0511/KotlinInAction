package list5

data class Person(val name: String, val age: Int)

fun main() {
  val people = listOf(
    Person("Alice", 29),
    Person("Bob", 21),
    Person("Charles", 31),
    Person("Dan", 21)
  )
  people.asSequence().map {
    print("name(${it.name})")
    it.name
  }.filter {
    print("length(${it.length})")
    it.length < 4
  }.toList()
  println()
  people.asSequence().filter {
    print("length(${it.name.length})")
    it.name.length < 4
  }.map {
    print("name(${it.name})")
    it.name
  }.toList()
}