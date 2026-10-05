fun main(){
    fun aplicarDescuento(precio: Double, porcentaje: Double = 10.0): Double{
        return precio - (precio * porcentaje)
    }
    fun repetir(veces: Int, accion: (Int) -> Unit){
        for (i in 1..veces){
            accion(i)
        }
    }
    println("Escribe 2 numeros")
    var num1 = readln().toDouble()
    var num2 = readln().toDouble()
    println("Escribe 1 opcion")
    println("""1.suma
        |2.resta
        |3.multiplicar
        |4.dividir
    """)
    var opcion = readlnOrNull()
    var calculadora: Map<String, (Double, Double) -> Double> = mapOf(
        "1" to { x, y -> x + y },
        "2" to { x, y -> x - y },
        "3" to { x, y -> x * y },
        "4" to { x, y -> x / y }
    )
    val operacion = calculadora[opcion]
    if(operacion!= null){
        val resultado = operacion(num1, num2)
        println("Resultado final: $resultado"
    } else {
        println("Opción incorrecta")
    }

}