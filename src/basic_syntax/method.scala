def add(x: Int): String = {
  val b = x + 3
  b + " is a value"
}

println(add(2))

println("Multi params")
def addThenMultiply(x: Int, y: Integer)(mul: Int): Int = x + y + mul

println(addThenMultiply(12, 3)(15))

def name: String = System.getProperty("user.name")
println(s"No params: $name")
