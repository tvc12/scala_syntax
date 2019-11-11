object IdFactory {
  private var counter = 0

  def create(): Int = {
    counter += 1
    counter
  }

  def log(): Unit = println(s"current value $counter")
}

val newId: Int = IdFactory.create()
println(s"Get new id from object $newId")
IdFactory.log

println("Companion objects")

case class Animal() {
  def runNow: Unit = Animal.run
}

object Animal {
  private def run: Unit = println("Meow run run run")
}

val  animal = Animal()
animal.runNow