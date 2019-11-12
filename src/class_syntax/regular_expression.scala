import scala.util.matching.Regex

println("Regular expression for check password:")

val pattern: Regex = "[0-9]{2}[a-z]{3}".r

pattern.findFirstMatchIn("13abc") match {
  case Some(_) => println("Accept password")
  case None => println("Login failed")
}

pattern.findFirstMatchIn("2abc") match {
  case Some(_) => println("Accept password")
  case None => println("Login failed")
}