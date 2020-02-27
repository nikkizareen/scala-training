case class Vehicle (vehicleid:Int, lat:Double, long: Double, Model:String){
  def state: String = (
    if (lat < 104 && long  > 100.01)
      ("Texas")

    else if (
      lat > 104 && long < 105)
      ("SanDiego")

    else ( "Unknown")

    )

}
val vehicle1: Vehicle = new Vehicle(1,99.01, 100.01,"Model car 1")
val vehicle2: Vehicle = new Vehicle(2,101.02, 100.01,"Model car 1")
val vehicle3: Vehicle = new Vehicle(3,102, 100.02,"Model car 1")
val vehicle4: Vehicle = new Vehicle(4,103.03, 100.04,"Model car 1")
val vehicle5: Vehicle = new Vehicle(5,104.01, 100.01,"Model car 1")
val vehicle6: Vehicle = new Vehicle(6,105.02, 100.01,"Model car 6")
val vehicle7: Vehicle = new Vehicle(7,106.02, 100.01,"Model car 7")
val vehicle8: Vehicle = new Vehicle(8,89, 100.02,"Model car 8")
val vehicle9: Vehicle = new Vehicle(9,108.08, 100.01,"Model car 9")
val vehicle10: Vehicle = new Vehicle(10,109, 100.06,"Model car 10")

case class VehicleState( vehicleid:Int, lat:Double, long: Double, Model:String, State:String)
val vehiclestate1:VehicleState = new VehicleState (vehicle1.vehicleid, vehicle1.lat, vehicle1.long, vehicle1.Model,vehicle1.state)
val vehiclestate2:VehicleState = new VehicleState (vehicle2.vehicleid, vehicle2.lat, vehicle2.long, vehicle2.Model,vehicle2.state)
val vehiclestate3:VehicleState = new VehicleState (vehicle3.vehicleid, vehicle3.lat, vehicle3.long, vehicle3.Model,vehicle3.state)
val vehiclestate4:VehicleState = new VehicleState (vehicle4.vehicleid, vehicle4.lat, vehicle4.long, vehicle4.Model,vehicle4.state)
val vehiclestate5:VehicleState = new VehicleState (vehicle5.vehicleid, vehicle5.lat, vehicle5.long, vehicle5.Model,vehicle5.state)
val vehiclestate6:VehicleState = new VehicleState (vehicle6.vehicleid, vehicle6.lat, vehicle6.long, vehicle6.Model,vehicle6.state)
val vehiclestate7:VehicleState = new VehicleState (vehicle7.vehicleid, vehicle7.lat, vehicle7.long, vehicle7.Model,vehicle7.state)
val vehiclestate8:VehicleState = new VehicleState (vehicle8.vehicleid, vehicle8.lat, vehicle8.long, vehicle8.Model,vehicle8.state)
val vehiclestate9:VehicleState = new VehicleState (vehicle9.vehicleid, vehicle9.lat, vehicle9.long, vehicle9.Model,vehicle9.state)
val vehiclestate10:VehicleState = new VehicleState (vehicle10.vehicleid, vehicle10.lat, vehicle10.long, vehicle10.Model,vehicle10.state)

