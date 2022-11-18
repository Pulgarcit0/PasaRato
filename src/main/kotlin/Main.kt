import java.util.*
import javax.swing.JOptionPane


fun main(args: Array<String>) {
        //Aqui se le pide los datos al usuario
        var h=Integer.parseInt(JOptionPane.showInputDialog(null,"Hora: "))
        var m=Integer.parseInt(JOptionPane.showInputDialog(null,"Minuto: "))
        var s=Integer.parseInt(JOptionPane.showInputDialog(null,"Segundo: "))
        var num: Int
        var hor: Int
        var min: Int
        var seg: Int

        //OPERACION HORA A SEGUNDOS
        num=h*3600
        //OPERACION MINUTO A SEGUNDO
        num=num+(m*60)
        //SE CALCULO DE LAS HORAS, MINUTOS Y SEGUNDO
        num +=s
        hor = num / 3600
        min = (num - 3600 * hor) / 60
        seg = num - (hor * 3600 + min * 60)
        //SE MANDA A IMPRIMIR EN PANTALL LA INFORMACION
        JOptionPane.showMessageDialog(null,"${hor.toString()}h $min m $seg g")
    }
//by Hufolino Valentin @Pulgarcito Valentin
