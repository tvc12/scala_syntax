def listOfDuplicate[T](x: T, length: Int): List[T] = {
  if (length <= 1)
    Nil
  else
    x :: listOfDuplicate(x, length - 1)
}
println(listOfDuplicate(3, 4))
println(listOfDuplicate("Ahihi", 3))