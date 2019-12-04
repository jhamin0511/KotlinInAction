package list4_4_2_3

import com.google.gson.Gson

class Person(val firstName: String, val lastName:String) {
  companion object {
  }
}

fun Person.Companion.fromJSON(jsonText: String): Person = Gson().fromJson(jsonText, Person::class.java)
