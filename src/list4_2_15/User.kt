package list4_2_15

class User(val name: String) {
  var address: String = "unspecified"
    set(value) {
      println(
        """
      Address was changed for ${name}:
      "${field}" -> "${value}".""".trimIndent()
      )
      field = value
    }
}
