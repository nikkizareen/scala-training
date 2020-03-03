case class Car (model:String, transmission:String,engineSize:Double, cost: Double , budget: Double){
  def economical: String = (
    if (cost > budget )
  ("Too expensive")
    else
      ("Affordable")
    )
}
val car1: Car =  Car(model = "Audi", transmission = "Manual", engineSize = 3.60, cost = 50000, budget = 20000)
val car2: Car =  Car(model = "Vauxal", transmission = "Automatic",engineSize = 2.5,cost = 35000,budget = 35000)
val car3: Car =  Car(model = "Skoda", transmission = "Automatic",engineSize = 2.5,cost = 56000,budget = 35000)
val car4: Car =  Car(model = "Merc", transmission = "Manual",engineSize = 2.5,cost = 90000,budget = 35000)
val car5: Car =  Car(model = "Audi", transmission = "Tiptronic",engineSize = 2.5,cost = 45000,budget = 35000)
val car6: Car = Car(model = "Fiat", transmission = "Automatic",engineSize = 2.5,cost = 25000,budget = 35000)

val car:List[Car]= List(car1,car2,car3,car4,car5,car6)

case class myCars(model:String,transmission:String,engineSiz:Double,cost:Double,budget:Double, economical:String )
val results:List [myCars]= car.map(x =>  myCars(x.model,x.transmission, x.engineSize,x.cost, x.budget,
  x.economical))
