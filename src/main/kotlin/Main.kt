import java.util.*
import javax.swing.JOptionPane


fun main(args: Array<String>) {
        //ESTAS TRES JOPTION, SON LOS QUE INTERACTUAN CON EL USUARIO, Y PIDEN DATOS
        var h=Integer.parseInt(JOptionPane.showInputDialog(null,"Hora: "))
        var m=Integer.parseInt(JOptionPane.showInputDialog(null,"Minuto: "))
        var s=Integer.parseInt(JOptionPane.showInputDialog(null,"Segundo: "))
        var num: Int
        var hor: Int
        var min: Int
        var seg: Int

        //OPERACION HORA A SEGUNDOS, POR LO QUE SE GUARDA EN LA VARIABLE NUM
        num=h*3600
        //OPERACION MINUTO A SEGUNDO
        num=num+(m*60)

        //HACE LAS OPERACIONES NESESARIAS
        num +=s //LA VARIABLE NUM, CONTIENE TODO LAS SUMA DE SEGUNDO, TANTO DE HORAS Y MINUTOS
        hor = num / 3600
        min = (num - 3600 * hor) / 60
        seg = num - (hor * 3600 + min * 60)

        //AQUE SE IMPRIME LOS DATOS YA GENERADOS
        JOptionPane.showMessageDialog(null,"${hor.toString()}h $min m $seg g")
    }
// BY HUGOLINO VALENTI MARTINEZ
// BY Pulgarcito Valentin
