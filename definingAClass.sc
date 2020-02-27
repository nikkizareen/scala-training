class Person {
  val firstName = "Nikki"
  val lastName  = "Zareen"
  def name  = firstName + "  " + lastName
}


class Person (first: String, last: String) {
  val firstName = first
  val lastName = last
  def name = firstName + "  " + lastName
}
new Person("Joe", "Blogs").firstName

class Car ( carModel: String, transmission:String, doors: Int, interior: String ){
  val model = carModel
  val automatic = transmission
  val carDoors = doors
  val leather = interior
def carDescription   = model + " " + automatic + " " + carDoors + " " + leather
}
new Car("Audi","Manual")



