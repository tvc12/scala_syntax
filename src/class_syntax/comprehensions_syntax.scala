def forAll(n: Int) = {
  for (i: Int <- 0 until n)
    yield (i, i - 1)
}

forAll(10).foreach {
  case (i, j) => println(s"Hello $i, $j")
}

forAll(10)