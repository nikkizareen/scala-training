object Oswald {
  val colour: String = "Black"
  val food : String = "Milk"
}

object Henderson{
  val colour: String = "Ginger"
  val food : String = "Milk"
}

object Quentin {
  val colour: String = "Tabby and white"
  val food: String = "Curry"
}


object learnScala {
  val book: String = "Book on scala"
  val terminal: String = "intellji"
}

object calc {
  def square (x:Double )= x * x
def cube (x: Double) = x * square(x)
}

object person {
  val firstName = "Nikki"
  val lastName = "Zareen"
}
object alien {
  def greet(p: person.type) =
    "Greetings, " + p.firstName + " " + p.lastName
}

object kids {
  val firstChild = "Haziq"
  val secondChild = "Faris"
  val thirdChild = "Laila"
}

object mum{
  def Hello(k: kids.type )=
    "Hello " + k.firstChild +  " ," + k.secondChild +  " ,"  +k.thirdChild
}

// mum.Hello(kids)


object scala{
 val book1 = "scalaBook"
   val intelj = "scalaWorkSheet"

}
object scalaBasics{
  def learnScala(s: scala.type ) =
    "Material required to get started" + "  " + s.book1 + "  & " + s.intelj
}
// scalaBasics.learnScala(scala)



