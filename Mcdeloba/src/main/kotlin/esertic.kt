import java.util.DoubleSummaryStatistics

fun main() {
val figure1 = Cylinder(2.0,3.0)
    val figure2 = Cube(4.0)
    val figure3 = Cone(3.0,4.0)
    println(figure1.GetVolume())
    println(figure2.GetVolume())
    println(figure3.GetVolume())

}

interface Gamotvla {
    fun GetVolume(): Double
}
     class Cylinder(var height: Double, var radius: Double) : Gamotvla  {

        override fun GetVolume(): Double {

            print("Volume of a Cylinder is: ")
            return Math.PI * radius * radius * height
        }


    }

     class Cube(var length: Double) : Gamotvla {

        override fun GetVolume(): Double {

            print("Volume of a cube is: ")
            return length * length * length
        }
    }

class Cone(var height: Double, var radius: Double) : Gamotvla {

        override fun GetVolume(): Double {

            print("Volume of a cone is: ")
            return Math.PI * radius * radius * height * 1/3

        }

    }





