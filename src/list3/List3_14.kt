package list3

fun User.validateBeforeSave() {
  fun validate4(value: String, fieldName: String) {
    if (value.isEmpty()) {
      throw IllegalArgumentException(
        "Can't save user ${id}: " +
            "empty ${fieldName}"
      )
    }
  }

  validate4(name, "Name")
  validate4(address, "Address")
}

fun saveUser4(user: User) {
  user.validateBeforeSave()
}

fun main() {
  saveUser4(User(1, "", ""))
}