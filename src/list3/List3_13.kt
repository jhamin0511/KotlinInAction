package list3

fun saveUser3(user: User) {

  fun validate3(value: String, fieldName: String) {
    if (value.isEmpty()) {
      throw IllegalArgumentException(
        "Can't save user ${user.id}: " +
            "empty ${fieldName}"
      )
    }
  }

  validate3(user.name, "Name")
  validate3(user.address, "Address")
}

fun main() {
  saveUser3(User(1, "", ""))
}