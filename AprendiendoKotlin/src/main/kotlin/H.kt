package org.example

fun main(){
    //1º Ejercicio de una lista numeros sacara los pares y la suma total con filter y sum
    val numeros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val pares = numeros.filter{it % 2 == 0}
    val suma = pares.sum()
    println("Lista original: $numeros")
    println("Lista de pares: $pares")
    println("Suma total: $suma")
    //2ºA partir de una lista de nombres, crear una lista con la longitud de cada nombre usando map, y mostrar el nombre más largo.
    val nombres = listOf("Lucía", "Mateo", "Sofía", "Alejandro", "Laura", "Daniel", "Elena")
    var longitudes = nombres.map { it.length }
    val nombreMasLargo = nombres.maxByOrNull { it.length }
    println("Lista original: $nombres")
    println("Longitudes: $longitudes")
    println("El nombre más largo es: $nombreMasLargo")
}