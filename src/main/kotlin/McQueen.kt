import kotlin.system.measureNanoTime
import kotlin.system.measureTimeMillis

/*fun main() {
  val arregloGenerado=(1..108).toMutableList()
  var listadesordenados = arregloGenerado.shuffle()
    val tiempo = measureTimeMillis {
        listadesordenados=listadesordenados.sorted()
    }
    val arregloGenerado = (1..108).toMutableList()
    var listadesordenados = arregloGenerado.shuffle()
    val tiempo = measureTimeMillis {
        listadesordenados.find {
            it == 1000
        }
    }
    //kotlin
    //lineal
    //busqueda bina
}*/
fun burbuja(){
    var lista= mutableListOf(10,4,6,2,5)
    var temporal =0
    var n=lista.size
    for (i in 0 until n) {
        for (j in 1 until (n - i))
            if (lista[j - 1] < lista[j]) {
                temporal = lista[j - 1]
                lista[j-1] = lista[j]
                lista[j] = temporal

            }
    }

}

