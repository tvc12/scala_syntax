println("Basic syntax:")

val animals: Seq[String] = Seq("Dog", "Cat", "Tiger")
val printAnimal = (animal: String): String => s"Animal is $animal"
animals.map(printAnimal).foreach((item) => print(item))