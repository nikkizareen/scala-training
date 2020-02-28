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

