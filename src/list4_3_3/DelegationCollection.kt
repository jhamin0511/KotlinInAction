package list4_3_3

class DelegationCollection<T>(
  innerList: Collection<T> = ArrayList<T>()
) : Collection<T> by innerList {
}
