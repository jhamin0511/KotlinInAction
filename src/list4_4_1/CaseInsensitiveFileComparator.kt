package list4_4_1

import java.io.File

object CaseInsensitiveFileComparator : Comparator<File> {
  override fun compare(p0: File, p1: File): Int {
    return p0.path.compareTo(p1.path, ignoreCase = true)
  }
}