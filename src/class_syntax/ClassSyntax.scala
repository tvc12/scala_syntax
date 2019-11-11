class ClassSyntax(
                   title: String,
                   subTitle: String
                 ) {
  def greet(name: String): Unit = println(s"Title $title, Name: $name")
}

val test = new ClassSyntax("A hi hi", "Ahuhu")
test.greet("A hi hi")
println(s"Test ne` $test")

val test1 = new ClassSyntax("A hi hi", "Ahuhu")
val test2 = new ClassSyntax("A hi hi", "Ahuhu")

println(s"Compare test1 vs test2 => result: ${test1 == test2}")