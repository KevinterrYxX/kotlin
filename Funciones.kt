fun main() {
    val nombre: String = "Jhoan"
    val años = 19
    val frase = felizDia(nombre, años)
    println(frase)

    println(felizDia(nombre, años))

    println(felizDia("Nico", 1))

    println(felizDia(nombre = "Nicolas", edad = 2))
}

fun felizDia(nombre: String, edad: Int = 30 ): String {
    val name = "Feliz cumpleanos $nombre"
    val dia = "Tienes $edad anos ahora"

    return "$name\n$dia"
}



fun felizCumpleaños(){
    println("Feliz cumpleaños kevin")
    println("Tienes ahora 20 años")
}