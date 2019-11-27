package list4

class Button2 : Clickable2, Focusable {
  override fun click() {
    println("I was clicked")
  }

  override fun showOff() {
    super<Clickable2>.showOff()
    super<Focusable>.showOff()
  }

}

fun main() {
  val button = Button2()
  button.showOff()
  button.setFocus(true)
  button.click()
}