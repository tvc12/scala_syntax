import scala.util.Random

val x: Int = Random.nextInt(10)

def matchTest(x: Int): String =
  x match {
    case 0 => "Zero"
    case 1 => "one"
    case 2 => "two"
    case 3 => "three"
    case _ => "other"
  }

println(s"Number is ${matchTest(x)}")