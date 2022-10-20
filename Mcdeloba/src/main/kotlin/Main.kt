import kotlin.math.sqrt

fun main() {
val kutxe1 = D2figures(1.0,2.0,1.0,2.0,3.0,2.0)
println(kutxe1.Kutxis_cos())
    println(kutxe1.Martobuloba())
}

class D2figures(var a1: Double,var a2: Double,var b1: Double, var b2: Double,var c1: Double,var c2: Double) {
    fun Kutxis_cos(): Double {
        return (a1 * a2 + b1 * b2 + c1 * c2) / (sqrt(a1 * a1 + b1 * b1 + c1 * c1) * sqrt(a2 * a2 + b2 * b2 + c2 * c2))
    }

    fun Martobuloba() {
        when (a1 * a2 + b1 * b2 + c1 * c2) {
            0.0 -> print("Angle between two planes is right")
         else ->
            print("Angle between is not right")
        }
    }
}
