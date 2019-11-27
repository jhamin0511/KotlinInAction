package list4

interface View {

  fun getCurrentState(): State

  fun restoreState(state: State) {}

}
