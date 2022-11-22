//Funções no Kotlin
fun main() {
    println("print")
    println(sum(2,3))
    println(sumI(33.0,33.0))
    println(sumI(33.3,33.2))

    sumPrint(10.0,22.0)

    println(a)
    println(b)

    println(ret.per)

    val items = listOf<String>("apple", "banana", "kiwifruit")
    for (i in items.indices){
        println(items[i])
    }

    println(whats(1))

    when {
        "apple" in items -> println("suco de maça")
        "melancia" !in items -> println("nao tem")
    }

    "as".cont()
}

//return Int
fun sum(a: Int, b: Int): Int{
    return  a + b
}

//inferencia
fun sumI(a: Double, b: Double) = a + b

//vazio, o Unit pode ser omitido
fun sumPrint(a: Double, b: Double) : Unit {
    println("sum of $a and $b is ${a + b}")
}


//Variaveis
val a: Int = 19 //imediatamente declarada
val b = 10 //inferencia

class Shape(var p: Double, var p1: Double) {
    var per = p*p1
}

val ret = Shape(1.0,10.99)

fun whats(objec: Any) =  when(objec) {
        1 -> "numeral"
        "hello" -> "meeting"
        else -> "dont know"
    }

fun String.cont(){

}