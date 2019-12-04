package list4_4_2_3

fun main() {
  val person = Person.fromJSON("{firstName:'Dmitry', lastName:'His'}")
  println("${person.firstName} / ${person.lastName}")
  val person2 = Person.fromJSON("{firstName:'Brent', lastName:'Hisww'}")
  println("${person2.firstName} / ${person2.lastName}")
}