package list4

interface Focusable {
  fun setFocus(b: Boolean) = println(
    "I ${if (b) {
      "got"
    } else {
      "lost"
    }} focus."
  )

  fun setName(name: String) = println(name)

  fun showOff() = println("I'm focusable!")

  fun setShowOff() = println("I'm focusable!")

  fun getShowOff() = println("I'm focusable!")

  fun set() = println("I'm focusable!")

  fun get() = println("I'm focusable!")
}
