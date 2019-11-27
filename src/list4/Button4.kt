package list4

class Button4 : View {
  override fun getCurrentState(): State = ButtonState()

  override fun restoreState(state: State) {
    super.restoreState(state)
  }

  class ButtonState : State {}
}
