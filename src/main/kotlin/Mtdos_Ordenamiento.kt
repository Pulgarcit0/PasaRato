import java.util.*

import javax.swing.JOptionPane




fun main(args: Array<String>) {
    val metodo = JOptionPane.showInputDialog(
        null,
        "SELECCIONE UN METODO DE ORDENAMIENTO",
        "ORDENAMIENTO",
        JOptionPane.QUESTION_MESSAGE,
        null,
        arrayOf<Any>("QUICSORT", "BURBUJA", "SHELLSORT"),
        "SELECCIONE"

    )

    if(metodo=="Amarillo"){
        val numeros = intArrayOf(1, 9, 23, 4, 55, 100, 1, 1, 23)
        println("Antes de QS: " + Arrays.toString(numeros))
        quicksort(numeros, 0, numeros.size - 1)
        println("Después de QS: " + Arrays.toString(numeros))
    }else if(metodo=="BURBUJA"){
        Burbuja()
    }else if(metodo=="SHELLSORT"){
        val arr = intArrayOf(23, 12, 1, 8, 34, 54, 2, 3)
        //println("Array before sorting")
        JOptionPane.showMessageDialog(null,arr.toString())
        for( a in arr) print("$a  ")
        shellsort(arr)
        println("Array after sorting")
        for( a in arr) print("$a  ")
    }

}

//--------------------->ORDENAMIENTO BURBUJA<------------------------------------------------------
fun Burbuja() {
    val a=JOptionPane.showInputDialog("Ingrese los numero y separador por comas ")
    val listaNumerosTexto=a.split(",".toRegex()).toTypedArray()
    val cantidad=listaNumerosTexto.size
    val listaNumeros=IntArray(cantidad)
    for (i in (0 until cantidad)){
        listaNumeros[i]=listaNumerosTexto[i].toInt()
    }
    var tem=0
    for(i in (0 until cantidad-1)){
        for(j in (0 until cantidad-1)){
            if(listaNumeros[j]>listaNumeros[j+1]){
                tem=listaNumeros[j]
                listaNumeros[j]=listaNumeros[j+1]
                listaNumeros[j+1]=tem
            }
        }
    }
    println("Humano aqui estan tus pinches numero ordenado de forma acendente")
    for (i in (0 until cantidad)){
        println(listaNumeros[i])
    }

    println("Humano aqui estan tus pinches numero ordenado de forma decendente")
    for (i in (cantidad-1 downTo 0)){
        println(listaNumeros[i])
    }
}
//--------------------->ORDENAMIENTO QUICSORT<------------------------------------------------------
private fun particion(arreglo: IntArray, izquierda: Int, derecha: Int): Int {
    // Elegimos el pivote, es el primero
    var izquierda = izquierda
    var derecha = derecha
    val pivote = arreglo[izquierda]
    // Ciclo infinito
    while (true) {
        // Mientras cada elemento desde la izquierda esté en orden (sea menor que el
        // pivote) continúa avanzando el índice
        while (arreglo[izquierda] < pivote) {
            izquierda++
        }
        // Mientras cada elemento desde la derecha esté en orden (sea mayor que el
        // pivote) continúa disminuyendo el índice
        while (arreglo[derecha] > pivote) {
            derecha--
        }
        /*
Si la izquierda es mayor o igual que la derecha significa que no
necesitamos hacer ningún intercambio
de variables, pues los elementos ya están en orden (al menos en esta
iteración)
*/if (izquierda >= derecha) {
            // Indicar "en dónde nos quedamos" para poder dividir el arreglo de nuevo
            // y ordenar los demás elementos
            return derecha
        } else { //Nota: yo sé que el else no hace falta por el return de arriba, pero así el algoritmo es más claro
            /*
  Si las variables quedaron "lejos" (es decir, la izquierda no superó ni
  alcanzó a la derecha)
  significa que se detuvieron porque encontraron un valor que no estaba
  en orden, así que lo intercambiamos
  */
            val temporal = arreglo[izquierda]
            arreglo[izquierda] = arreglo[derecha]
            arreglo[derecha] = temporal
            /*
  Ya intercambiamos, pero seguimos avanzando los índices una vez más
  */izquierda++
            derecha--
        }
        // El while se repite hasta que izquierda >= derecha
    }
}

// Divide y vencerás
private fun quicksort(arreglo: IntArray, izquierda: Int, derecha: Int) {
    if (izquierda < derecha) {
        val indiceParticion = particion(arreglo, izquierda, derecha)
        quicksort(arreglo, izquierda, indiceParticion)
        quicksort(arreglo, indiceParticion + 1, derecha)
    }
}

//--------------------->ORDENAMIENTO SHELLSORT<------------------------------------------------------
fun shellsort(arr: IntArray): Int {
    val n = arr.size

    // decide the gap, then reduce the gap
    var gap = n / 2
    while (gap > 0) {
        // Do a gapped insertion sort for this gap size.
        // The first gap elements a[0..gap-1] are already
        // in gapped order keep adding one more element
        // until the entire array is gap sorted
        var i = gap
        while (i < n) {
            // add a[i] to the elements that
            // have been gap sorted save a[i] in temp and make a hole at
            // position i
            val temp = arr[i]

            // shift earlier gap-sorted elements up until
            //the correct location for a[i] is found
            var j = i
            while (j >= gap && arr[j - gap] > temp) {
                arr[j] = arr[j - gap]
                j -= gap
            }

            // put temp (the original a[i]) in its correct
            // location
            arr[j] = temp
            i += 1
        }
        gap /= 2
    }
    return 0
}
