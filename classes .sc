class Timestamp(val seconds: Long)
object Timestamp {
  def apply(hours: Int, minutes: Int, seconds: Int): Timestamp =
    new Timestamp(hours*60*60 + minutes*60 + seconds)
}
Timestamp (1, 1, 1).seconds

class Person (val firstName: String, lastName: String){
  def name: String =
    firstName + lastName
}
object Person {
  def apply(name: String):Person = {
    val parts = name.split("")
    new Person(parts(parts(0:Int), parts(1:Int)
  }
}