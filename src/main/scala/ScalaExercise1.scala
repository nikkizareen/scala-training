// // from a operator style
// 1 + 2 + 3
// //rewrite in method call style
// 1.+(2).+(3)

// //from a method style
// "foo".take(1)

// // to rewrite in operator - style

// "foo" take 1


// //literal objects - a fixed value that stands for itself eg:
// 100

// //characters are 16 bit unicode values written as a single character enclosed in single qoutes
// 'a'


// //unit is an important concept in scala . Scala synatics constructs are expressions that
// //have types and values .

// //every literal expression has a type and evaluates  to a value
// 42.0 // this is a double
// 123L // this is a long

// "a" //string
// 'b' //char

// "hello"
// println("Hello World")

// ////object literals , we can declare an empty object {}, not really useful an empty object
// object test {}
// test

// //create an object with a method
// // here we have created a object called test2 and a method called name
// object test2{
//   def name: String = "probably the best object ever"
// }
// //to call it type the following :
// test2.name

// // complex object with method
// object test3 {
//   def hello (name: String) =
//   "hello " + name
// }

// test3.hello("Nikki")

// //syntax for declaring a method :
// // def name(parameter:type): resultType = bodyExpression

// // fields, an object can contain other objects called fields. using val or var,
// // syntax is    val name: type = valueExpression
// // val defines an immutable field , meaning we cant change the value bound to the name , always prefer val
// //var is mutable allowing to change the bound value
// // fields give a name to a value
// // method gives a name to a computation that produces a value
// //eg
// object test4 {
//   val name = "Noel"
//   def hello(other:String): String =
//     name + " say hi to " + other
// }
// test4.hello("Dave")

