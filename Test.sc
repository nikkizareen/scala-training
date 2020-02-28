object Breakfast{
  def menu(menu:String):String =
    "This breakfast includes ..." + " " + menu
}
Breakfast.menu("Eggs")


object Breakfast2{
  def menu2( option1:String, option2:String, option3:String):String =
    "For breakfast you have the following options ..." + option1 + " " +option2 + " " +option3

}
Breakfast2.menu2(option1 = "eggs",option2 = "Toast", option3 = "Coffee")

object Oswald {
  def cat (colour:String , food:String):String =
    "Oswald is a  " + " " + colour +  " and likes " + food
}
Oswald.cat(colour = "Black", food = "Milk")

object Henderson {
  def cat2(colour2:String, food2:String):String =
    "Henderson is a cat which is " + " " + colour2 + " " + " and likes " + food2
}
Henderson.cat2(colour2 = "Ginger", food2 = "Chips")

object Quintin {
  def cat3(colour3:String, food3:String):String =
    "Quntin is a cat which is  " + colour3 + " " + "and likes to eat " + food3
}
Quintin.cat3(colour3 = "Tabby and White", food3 = "Curry")

object calc{
  def cube(x:Double):Double =
    x * x
  def square(x:Double):Double = x + cube(x:Double)
}
calc.cube(1.1)

object person{
  val firstName = "Nikki"
  val lastName = "Zareen"
}
object alien{
  def great(p:person.type )=
    "Hello" + person.firstName + "  " + person.lastName

}
alien.great(person)


