val name: List[Any] = List ("Molly", "Laila", "Sarah", "Moon")

name.apply(0:Int)
//apply method used with lists it will allow for indexing, allows you to find the item speciefied

name(2)
//can ignore typeing apply and use the above way

name.head
// head gives you the first element


name.tail
// this returns everything apart from the the first element

name.tail.head
//this will give you the tail first and then the head of this new list

val empty: List[Any] = List()
//empty list example

name.length
// the number of parts in the list

name.contains("tom")
// validates whether the specified value is in the list

name.find(x => x =="Sarah")
// == look at this like asking a question and will return a boolean, this will start from the beginning of the list and output the results

val numbers: List[Int] =List (1,2,3,4)

numbers.filter(x => x  <4)
//filter returns a list of all elements that meet a given condition , its different to find which stops at the first condtion met

numbers :+ 5
//this appends to a list

name :+ "John"

10 +: numbers
//this function adds a number to the beginning of the list


numbers ++ name
// this will add 2 lists together

numbers ++ List(45, 56,66)
//this adds a new list to an existing list


numbers.map(x => x +1 )
//mapping is taking a list and applying some logic to produce a new list

numbers.map(x => List(x *2))
// go through the list and generate indivudal lists for each segment

numbers.flatMap(x => List (x *2))
// still produce me the lists but only give me the values of each list

numbers.foreach( x => println(x))
// this will apply the logic to each value in the list but doesnt return a list
