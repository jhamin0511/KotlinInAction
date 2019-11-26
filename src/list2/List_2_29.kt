package list2

import java.io.BufferedReader
import java.io.StringReader

fun readNumber3(reader: BufferedReader) {
  val number = try {
    Integer.parseInt(reader.readLine())
  } catch (e: NumberFormatException) {
    null
  }
  println(number)
}

fun main() {
  val reader = BufferedReader(StringReader("not a number"))
  readNumber3(reader)
}

class Foo(val name: String, val age: Int) {

  fun printInfo() {
    println("My name is $name, My age is $age")
  }

}