package org.example

fun main(){
    val alumnos = listOf(
        "Ana" to 8.5,
        "Luis" to 4.0,
        "Marta" to 9.25,
        "Pedro" to 6.0,
        "Laura" to 3.5,
        "Carlos" to 7.0,
        "Sofía" to 5.5,
        "Javier" to 2.0,
        "Elena" to 9.75,
        "Diego" to 6.5
    )
    val media = alumnos.map { it.second }.average()
    println(media)
    val palabras = listOf("sol", "luna", "estrella", "cielo", "mar")
    var mayusculas = palabras.filter { it.length > 4}.map { it.uppercase() }
    println(mayusculas)
}