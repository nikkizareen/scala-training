import scala.Boolean

class Person (val first:String, val last:String) {
  val firstName = first
  val lastName = last
  def greet = firstName + " " + lastName

}
val Nikki = new Person("Nikki", "Zareen").firstName
val Laila = new Person("Laila", "Zareen").firstName
val Haziq  = new Person("Haziq","Majid").firstName
val Haziq = new Person("Haziq", "Majid").lastName

class House (val bedroom:String, val bathrooms:String, reception:String){
  val beds = bedroom
  val baths = bathrooms
  val livingRooms = reception
}





class Cat(val colour: String, val food: String)
val oswald = new Cat("Black", "Milk")
val henderson = new Cat("Ginger", "Chips")
val quentin = new Cat("Tabby and white", "Curry")

class Person(first: String, last: String) {
  val firstName = first
  val lastName = last
  def name = firstName + " " + lastName
}

class Piano( colour: String, model: String,stock: Boolean )
val model1 = new Piano( colour = "Black",model = "Kawai", stock = true )
val model2 = new Piano(colour = "gloss white",model = "Yamaha", stock = false)

