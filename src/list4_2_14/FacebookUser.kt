package list4_2_14

class FacebookUser(val accountId: Int) : User {
  override val nickName = getFacebookName(accountId)
}
