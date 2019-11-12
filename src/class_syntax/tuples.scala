val animals = ("MeoMeo", 25)
val (name, number) = animals
println(s"Animals is: $animals")
println(s"Pattern - Name: $name, number $number")

val items = List(("Hello", 1), ("Hello", 2, 3), ("Hello", 2))

items.foreach((item) => println(s"${item.productElement(0)}: ${item.productElement(1)}"))

var numPairs: List[(String, Int)] = List(("Hello", 5), ("Hello", 1234))

println("Get value each pairs:")
for ((a, b) <- numPairs) {
  println(s"Key: $a, Value: $b")
}