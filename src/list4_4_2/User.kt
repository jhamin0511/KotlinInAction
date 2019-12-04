package list4_4_2

import list4_2_14.getFacebookName



class User private constructor(val nickname:String){
  companion object{
    fun newSubscribingUser(email: String) = User(email.substringBefore('@'))
    fun newFacebookUser(accountId:Int) = User(getFacebookName(accountId))
  }

}
