package list4_4_2

fun main() {
  val subscribingUser = User.newSubscribingUser("jhm@gmail.com")
  val facebookUser = User.newFacebookUser(4)
  println(subscribingUser.nickname)
  println(facebookUser)
}