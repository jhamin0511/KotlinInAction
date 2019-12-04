package list4_4_1

data class Person(val name:String) {
  object NameComparator : Comparator<Person>{
    override fun compare(p0: Person, p1: Person): Int
        = p0.name.compareTo(p1.name)
  }
}
