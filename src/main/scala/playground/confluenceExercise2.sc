object exercise2 {
  case class RoomPrice(roomTypeId: Int, cost: Double)
  case class person(personId: Int, firstName:String, surname:String )
  case class RoomServiceCharges(bookingId: Int, itemName: String, cost:Double, date:String)
  case class Booking(bookingId: Int, accountId: Int, personId: Int, room: String, roomTypeId: Int, startDate: String, DaysBooked: Int)
  case class Account(accountId: Int, accountName: String, discount:Int)

  val room1 = RoomPrice(1, 100.0)
  val room2 = RoomPrice(2, 200.0)

  val beer1 = RoomServiceCharges(4,"beer", 3.75, "01/10/2020")
  val beer2 = RoomServiceCharges(4,"beer", 3.75, "02/10/2020")
  val beer3 = RoomServiceCharges(4,"beer", 3.75, "03/10/2020")
  val vodka1 = RoomServiceCharges(4,"bottle of vodka", 20.10, "04/10/2020")
  val vodka2 = RoomServiceCharges(4,"bottle of vodka", 20.10, "08/10/2020")

  val booking1 = Booking(1,1,1, "12",1, "10/10/2020", 1 )
  val booking2 = Booking(2,1,2, "13",1, "10/10/2020", 1 )
  val booking3 = Booking(3,1,3, "22",2, "10/10/2020", 1)
  val booking4 = Booking(4,2,4, "PentHouse",2, "01/10/2020", 8 )
  val booking5 = Booking(5,2,4, "1",1, "20/10/2020", 1 )

  val account1 = Account(1,"BusyPeopleInc",0)
  val account2 = Account(2,"Mr Blank Name",50)

  val person1 = person(1,"Person","One")
  val person2 = person(2,"Person","Two")
  val person3 = person(3,"Person","Three")
  val person4 = person(4,"Blank","Name")

  val accountList = List(account1, account2)
  val bookingList:List[Booking] = List(booking1, booking2, booking3, booking4, booking5)
  val roomPriceList = List(room1, room2)
  val roomServiceList = List(beer1, beer2, beer3, vodka1, vodka2)

  //please create an output of this per account
  case class accountInvoice(account: Account, roomCost: Double, RoomServiceTotal: Double, total: Double)

  def
  }

}