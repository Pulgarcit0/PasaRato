import javax.swing.JOptionPane

fun main(){

    var rom=12
    var r= arrayListOf<String>("I","II","III","IV","V","VI","VIII","VII","IX","X")
    var n= arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10)
    //var rom=Integer.parseInt(JOptionPane.showInputDialog("Numero"))

    var re= arrayListOf<String>()
    var tem= arrayListOf<String>()
    for (i in 0 until 10) {

        if (rom == n[i]) {
            System.out.println("Posición: "+(i+1)+"-> "+r[i])
        }else if (rom != n[i]){
            for (j in 0..rom){
                if(rom==j){
                    System.out.println("Posición: "+j+"->>"+r[9]+r[i])
                }
            }
        }
    }

}
