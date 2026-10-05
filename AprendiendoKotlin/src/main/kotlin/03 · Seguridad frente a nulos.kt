fun main() {

fun longitudNombre(nombre: String?): Int{
    return nombre?.length ?:0
}
    println("Escribe tu nombre")
    println(longitudNombre(readlnOrNull()))
    println("Escribe un numero")
    var numero = readlnOrNull()?.toIntOrNull()
    var cuadrado = numero?.let { it * it }?: "Opcion no valida"
    cuadrado?.let { println("Cuadrado: $cuadrado") }

    data class Tutor(val email: String?)
    data class Alumno(val nombre: String, val tutor: Tutor?)
    fun obtenerEmailTutor(alumno: Alumno): String{
        return alumno.tutor?.email ?: "Desconocido"
    }
}
