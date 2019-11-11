trait Animal {
  protected var x: Int = 5

  def run(name: String): Unit = println("$name running")
}

class Cat extends Animal {
  override
  def run(name: String): Unit = println(s"Cat running")
}

trait Post[Animal] {
  def hasNext: Boolean

  def next: Animal
}

class PostAnimal() extends Post[Cat] {
  override def hasNext: Boolean = false

  override def next: Cat = null
}


object Main {
  def main(args: Array[String]): Unit = {
    println("Chay day truoc nay")
    val animal = new Cat()
    animal.run("Ahihi")
    val post = new PostAnimal()
    println(s"Generic types: ${post.hasNext}")
  }
}