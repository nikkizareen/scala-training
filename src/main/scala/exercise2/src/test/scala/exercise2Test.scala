import exercise2._
import org.scalatest.WordSpec
import org.scalatest.Matchers._


class exercise2Test extends WordSpec {
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

  val person1 = Person(1,"Person","One")
  val person2 = Person(2,"Person","Two")
  val person3 = Person(3,"Person","Three")
  val person4 = Person(4,"Blank","Name")

  val accountList = List(account1, account2)
  val bookingList:List[Booking] = List(booking1, booking2, booking3, booking4, booking5)
  val roomPriceList = List(room1, room2)
  val roomServiceList = List(beer1, beer2, beer3, vodka1, vodka2)


  "Exercise2" should {
    "create Account Inovice for a account1" in {
      val expected = AccountInvoice(account1,0,0,0)
      val actual = createAccountInvoice(account1,bookingList, roomServiceList)
      actual shouldBe expected
    }
    "create Account Inovice for a account2" in {
      val expected = AccountInvoice(account2, 0, 51.45, 0)
      val actual = createAccountInvoice(account2, bookingList, roomServiceList)
      actual shouldBe expected
    }
    "get room service total for account 1" in {
      val expected = 0
      val actual = getRoomServiceTotal(1,bookingList,roomServiceList)
      actual shouldBe expected
    }
    "get room service total for account 2" in {
      val expected = 51.45
      val actual = getRoomServiceTotal(2,bookingList,roomServiceList)
      actual shouldBe expected
    }
    "get room service charge for booking 1"  in {
      val expected = 0
      val actual = getRoomServiceChargeForBooking(booking1,roomServiceList)
      actual shouldBe expected
    }
    "get room service charge for booking 4"  in {
      val expected = 51.45
      val actual = getRoomServiceChargeForBooking(booking4,roomServiceList)
      actual shouldBe expected
    }
    "apply Discount on cost for 0 discount" in {
      val expected = 10
      val actual = applyDiscount(10,0)
      actual shouldBe expected
    }
    "apply Discount on cost for 100 discount" in {
      val expected = 50
      val actual = applyDiscount(100, 50)
      actual shouldBe expected
    }
    "apply Discount on cost for  discount" in {
      val expected = 77
      val actual = applyDiscount(110, 30)
      actual shouldBe expected
    }
    "total cost of room booking 1" in {
      val expected = 100
        val actual = getRoomCostForBooking(booking1,roomPriceList)
      actual shouldBe expected
    }
    "total cost of room booking 3" in {
      val expected = 200.00
      val actual = getRoomCostForBooking(booking3,roomPriceList)
      actual shouldBe expected
    }

    "total cost of room booking 4" in {
      val expected = 1600.00
      val actual = getRoomCostForBooking(booking4, roomPriceList)
      actual shouldBe expected
    }
  }

}
