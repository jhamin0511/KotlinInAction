package list3

open class View {

  open fun click() {
    println("View clicked")
  }

}

class Button : View() {

  override fun click() {
    println("Button clicked")
  }

}

fun main() {
  val view: View = Button()
  view.click()

  val view2 = View()
  view2.click()
}