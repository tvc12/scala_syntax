import scala.collection.mutable.ListBuffer

abstract class Animal {
  val name: String

  def run(): Unit = {
    println(s"Hello my name is $name")
  }
}


trait Cat extends Animal {
  override def run(): Unit = {
    println(s"Hello my name is cat and name is $name")
  }
}

class Dog(val name: String) extends Animal {
  override def run(): Unit = {
    println("Tao la dog nha")
  }
}

class SuperCat(val newName: String) extends Dog(newName) with Cat {

}

val dog: Dog = new Dog("Oggy")
dog.run()

val superCat: SuperCat = new SuperCat("Wokong")
superCat.run()

abstract class Iterator {
  type T

  def hasNext: Boolean

  def next: T

}

class NumberIterator(n: Int) extends Iterator {
  override type T = Int

  private var i = 0

  override def hasNext: Boolean = i < n

  override def next: NumberIterator.this.T = {
    i += 1
    i
  }

}

trait RichIterator extends Iterator {
  def map[V](f: T => V): ListBuffer[V] = {
    var arrays: ListBuffer[V] = ListBuffer[V]()
    while (hasNext) {
      val item: T = next
      val nextItem: V = f(item)
      arrays += nextItem
    }
    arrays
  }
}

class RichItem(max: Int) extends NumberIterator(max) with RichIterator {

}

val rich = new RichItem(10)
rich.map[String]((item) => s"Index $item").foreach((item) => println(s"Hello $item"))