package list4

class Outer {

  val name = "Jeong"

  inner class Inner {
    fun getouterReference(): Outer = this@Outer

    fun getName(): String = this@Outer.name
  }

}
