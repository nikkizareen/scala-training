package playground

object Main extends App {

  def addSomething(x: Int, y: Int): Int =
    x + y

  val age: Int =
    100

  val num0: Double =
    100d

  val str: String =
    "Hello"

  val character: Char =
    'A'

  val lng: Long =
    2L

  val listA: List[Int] =
    List(1, 2, 3, 4, 5)

  val listB: List[String] =
    List("a", "b", "c")

  println(addSomething(age, 2))
  println("nikki")
  println(age)
  println(num0)
  println(str)
  println(character)
  println(lng)
  println(listA)
  println(listB)
}
