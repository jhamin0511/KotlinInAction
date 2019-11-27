package list4

sealed class Expr2 {
  class Num2(val value: Int) : Expr2()

  class Sum2(val left: Expr2, val right: Expr2) : Expr2()
}

fun eval2(e: Expr2): Int =
  when (e) {
    is Expr2.Num2 -> {
      e.value
    }
    is Expr2.Sum2 -> {
      eval2(e.right) + eval2(e.left)
    }
  }
