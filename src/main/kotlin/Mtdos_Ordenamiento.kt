import java.util.Arrays
import javax.swing.JOptionPane

fun Bubble(a:String) {
    var listaNumerosTexto=a.split(",".toRegex()).toTypedArray()
    var cantidad=listaNumerosTexto.size
    var listaNumeros=IntArray(cantidad)
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


fun main(){
    Bubble(JOptionPane.showInputDialog("Ingrese los numero y separador por comas "))
}
