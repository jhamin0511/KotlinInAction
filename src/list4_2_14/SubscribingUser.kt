package list4_2_14

class SubscribingUser(val email: String) : User {
  override val nickName: String
    get() = email.substringBefore('@')
}
