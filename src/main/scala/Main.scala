import objetos.Perro
import vehiculo.Motocicleta

object Main {
  def main(args: Array[String]): Unit = {


    val caniche = new Perro(pelo = "blanco", patas = 4, size = 2 )

    println(caniche.getSize())
    println(caniche.getCantidadPatas())
    println(caniche.getcolorDePelo())



    /*
        val motocicleta = new Motocicleta(ruedas = 2, color = "negro", marca = "honda", peso = 240)
        println(motocicleta.getPeso())
        println(motocicleta.getcolor())
        println(motocicleta.getMarca())
        println(motocicleta.getRuedas())

     */
  }
}
