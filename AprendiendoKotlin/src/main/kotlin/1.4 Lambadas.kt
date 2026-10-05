package org.example

fun main() {
    val a: Int? = 10
    val b: Int? = null // Esta variable es nula

    // 1. Suma (+) -> si b es null, usa 0
    val suma = (a ?: 0) + (b ?: 0)
    println("Suma: $suma") // 10 + 0 = 10

    // 2. Resta (-) -> si b es null, usa 0
    val resta = (a ?: 0) - (b ?: 0)
    println("Resta: $resta") // 10 - 0 = 10

    // 3. Multiplicación (*) -> si b es null, usa 0 (o 1 según lo que busques)
    val multiplicacion = (a ?: 1) * (b ?: 0)
    println("Multiplicación: $multiplicacion") // 10 * 0 = 0

    // 4. División (/) -> ¡OJO! En el divisor usamos 1 para no dividir entre 0
    val division = (a ?: 0) / (b ?: 1)
    println("División: $division") // 10 / 1 = 10

    // 5. Módulo (%) -> resto de la división; también usamos 1 como respaldo
    val modulo = (a ?: 0) % (b ?: 1)
    println("Módulo: $modulo") // 10 % 1 = 0


}