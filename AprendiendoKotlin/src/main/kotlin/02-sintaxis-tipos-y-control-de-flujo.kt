package org.example

fun main(){
        for( i in 1..12)
            when(i){
                1 -> println("Enero")
                2 -> println("Febrero")
                3 -> println("Marzo")
                4 -> println("Abril")
                5 -> println("Mayo")
                6 -> println("Junio")
                7 -> println("Julio")
                8 -> println("Agosto")
                9 -> println("Septiembre")
                10-> println("Octubre")
                11-> println("Noviembre")
                12-> println("Diciembre")
            }
        for(i in 1..10)
            for(j in 1..10)
                println("$i + $j = ${i*j}")
    println(clasificarEdad(15))
    println(clasificarEdad(69))
    println(clasificarEdad(20))
}
fun clasificarEdad(edad: Int): String {
    if (edad < 18)
        return "Menor"
    else if (edad >= 18 && edad < 67)
        return "Mayor"
    else (edad >= 67)
    return "Jubilado"
}

