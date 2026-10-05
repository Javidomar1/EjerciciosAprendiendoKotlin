package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Escribe tu nombre")
    var nombre = readlnOrNull()
    println("Escribe tu edad")
    var edad = readln().toInt()
    var fut = edad + 10
    print("Hola $nombre dentro de 10 años tendras :" + fut)
}