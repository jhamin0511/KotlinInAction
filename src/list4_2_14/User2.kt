package list4_2_14

interface User2 {
  val email: String
  val nickName: String
    get() = email.substringBefore('@')
}
