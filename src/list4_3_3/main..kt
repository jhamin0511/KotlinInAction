import list4_3_3.CountingSet

fun main() {
  val cset = CountingSet<Int>()
  cset.addAll(listOf(1,2,3))
  println("${cset.objectsAdded} objects were added, ${cset.size} remain")
}