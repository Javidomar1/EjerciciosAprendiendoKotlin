package org.example

data class Producto(val nombre: String, val precio: Double)
class Persona(val nombre: String, val anioNacimiento: Int) {

//     2. Añadimos el método calcularEdad()
    fun calcularEdad(): Int {
        // Obtenemos el año actual del sistema automáticamente
        val anioActual = LocalDate.now().year
        return anioActual - anioNacimiento
    }
}
fun main(){
    var numeros = listOf(1,2,3,4,5,6,7,8,9,10)
    var pares = numeros.filter {it % 2 == 0}
    var sumapares = pares.sum()
    println(pares)
    println("Suma: $sumapares")

    var nombres = listOf<String>("Juan","pedor","Ana","Aroa")
    var longitud = nombres.map{ it.length}
    println(longitud)
    var longitudMax = nombres.maxByOrNull { it.length }
    println(longitudMax)

    var numeross = listOf(1,2,3,4,5,6,7,8,9,10)
    var numerosos = numeross.reduce{a ,b -> a+b}
    println(numerosos)

    var numeroosFold = numeross.fold(100){a,b -> a+b}
    println(numeroosFold)
    // la difercia que es tienes que darle 1 un numeros de iniciacion

    var producto = listOf(
        Producto("Ratón", 19.99),
        Producto("Portátil", 899.0),
        Producto("Teclado", 45.5),
        Producto("Monitor", 180.0)
    )
    val mayorPrecio = producto.sortedBy{it.precio}
    val mayorPrecios = producto.maxByOrNull{it.precio}
    println(mayorPrecio)
    println(mayorPrecios)

    val frases = listOf(
        "Hola mundo en Kotlin",
        "Programar es muy divertido",
        "Practicando con flatMap"
    )
    var unicas = frases.flatMap { it.split(" ") }
    println(unicas)

    var edades = listOf<Producto>()
}

