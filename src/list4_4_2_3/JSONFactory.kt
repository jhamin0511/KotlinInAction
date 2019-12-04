package list4_4_2_3

interface JSONFactory<T> {
  fun fromJSON(jsonText: String): T
}
