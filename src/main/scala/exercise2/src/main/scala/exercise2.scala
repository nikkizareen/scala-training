object exercise2 {
  case class RoomPrice(roomTypeId: Int, cost: Double)
  case class Person(personId: Int, firstName:String, surname:String )
  case class RoomServiceCharges(bookingId: Int, itemName: String, cost:Double, date:String)
  case class Booking(bookingId: Int, accountId: Int, personId: Int, room: String, roomTypeId: Int, startDate: String, DaysBooked: Int)
  case class Account(accountId: Int, accountName: String, discount:Int)


  case class AccountInvoice(account: Account, roomCost: Double, RoomServiceTotal: Double, total: Double)


  def createAccountInvoice(account: Account,bookingList:List[Booking],roomServiceCharges:List[RoomServiceCharges] ): AccountInvoice = {
    val roomServiceTotal =
      getRoomServiceTotal(account.accountId,bookingList, roomServiceCharges)
    AccountInvoice(account,0,roomServiceTotal,0)

  }
  def applyDiscount (cost:Double, discount:Int):Double ={
    val discountAmount = cost /100 * discount
    cost - discountAmount
  }
  def getRoomCostForBooking ( booking:Booking, roomPriceList: List[RoomPrice])={
    val roomCost = roomPriceList.filter(_.roomTypeId == booking.roomTypeId).head.cost
    roomCost * booking.DaysBooked
  }
  def getRoomCostTotal (accountId:Int, bookingList:List[Booking],roomPriceList: List[RoomPrice])={
    val filteredBookingList = bookingList.filter(b => (b.accountId == accountId))
    val listOfCosts = filteredBookingList.map(b => ((getRoomCostForBooking(b,roomPriceList))))
    val sumOfCost = listOfCosts.sum
    sumOfCost


  }



  def getRoomServiceTotal(accountId:Int, bookingList:List[Booking],roomServiceCharges:List[RoomServiceCharges]):Double = {

    val filteredBookingList = bookingList.filter(b => (b.accountId == accountId))
    val listOfCosts = filteredBookingList.map(b => (getRoomServiceChargeForBooking(b,roomServiceCharges)))
    listOfCosts.sum
  }
  def getRoomServiceChargeForBooking(booking: Booking,roomServiceCharges:List[RoomServiceCharges]): Double = {
    val filteredRoomServiceCharges = roomServiceCharges.filter(rsc => (rsc.bookingId == booking.bookingId))
    filteredRoomServiceCharges.foldLeft(0.00)(_+_.cost)
  }

}
