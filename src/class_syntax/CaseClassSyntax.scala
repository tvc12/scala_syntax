case class Meo(x: String, y: String) {

}

val meo1 = Meo("123", "456")
//meo1.x = "1000"
//meo1.y = "1234"
println(s"Meo ne` $meo1")
val meo2 = Meo("123", "456")
println(s"Compare meo1 vs meo2 => result: ${meo1 == meo2}")
val a = meo2.copy("1234")
println(s"Copy $a")
