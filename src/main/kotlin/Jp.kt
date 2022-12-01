import kotlin.system.measureTimeMillis
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
/*  Santiago Canseco María Fernanda
*   Estructuras de datos
*   Ing. Informatica
*/
namespace intercalacion_simple
{
    class Program
    {
      fun Main()
        {
            // Declarando variables,
            int f, i, izq, der, N, mitad;
            float[] sueldos = new float[17];
            float aux, sueldo;
            // Declarando el tamaño del vector
            N = sueldos.Length;
            // Titulo para ingresar sueldos
            Console.WriteLine("=-=-=-=-= Insertando sueldos =-=-=-=-=");
            Console.WriteLine("");
            // Ingresando salarios
            for (i = 0; i < 17; i++){
            Console.WriteLine("Ingrese el sueldo #{0}.", (i + 1));
            sueldo = Convert.ToSingle(Console.ReadLine());
            sueldos[i] = sueldo;
        }
            Console.Clear();
            // Mostrando sueldos
            Console.WriteLine("=-=-=-=-= Mostrando sueldos desordenados =-=-=-=-=");
            Console.WriteLine("");
            for (i = 0; i < 17; i++){
            Console.WriteLine("{0}.- ${1} ", (i + 1), sueldos[i]);
        }
            Console.WriteLine("Presione cualquier tecla para mostrar ordenado.");
            Console.ReadKey();
            Console.Clear();
            // Procedimiento de intercalación
            for (i = 1; i < N; i++){
            aux = sueldos[i];
            izq = 0;
            der = i - 1;
            while (izq <= der){
                mitad = (izq + der) / 2;
                if (aux <= sueldos[mitad])
                    der = mitad - 1;
                else
                    izq = mitad + 1;
            }
            f = i - 1;
            while (f >= izq){
                sueldos[f + 1] = sueldos[f];
                f--;
            }
            sueldos[izq] = aux;
        }
            // Mostrando sueldos
            Console.WriteLine("=-=-=-=-= Mostrando sueldos ordenados =-=-=-=-=");
            Console.WriteLine("");
            for (i = 0; i < 17; i++){
            Console.WriteLine("{0}.- ${1} ", (i + 1), sueldos[i]);
        }
            Console.WriteLine("Presione cualquier tecla para terminar.");
            Console.ReadKey();
        }
    }
}


using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


namespace ordenamiento_sort
{
    class Program
    {
        private int [] numeros;
        private IList<IList<int>> digitos = new List<IList<int>>();
        private int tmax = 0;
        public Program (){
        for (int x = 0; x < 10; x++){
            digitos.Add(new List<int>());
        }
        numeros=new int[39];
        Console.WriteLine("=-=-=-=-= Ingresando valores =-=-=-=-=");
        Console.WriteLine("");
        for (int c = 0; c < numeros.Length; c++){
            Console.WriteLine("Ingrese el numero de control del alumno #{0}.", c + 1);
            numeros[c] = int.Parse(Console.ReadLine());
            if(tmax<numeros[c].ToString().Length){
                tmax = numeros[c].ToString().Length;
            }
        }
    }
        public void SortRaiz(){
        for (int i = 0; i < tmax; i++){
            for (int j = 0; j < numeros.Length; j++){
            int digito = (int)((numeros[j] % Math.Pow(10,i+1))/Math.Pow(10,i));
            digitos[digito].Add(numeros[j]);
        }
            int indice = 0;
            for (int y = 0; y < digitos.Count; y++){
            IList<int> seldigito = digitos[y];
            for(int I=0; I < seldigito.Count; I++){
            numeros[indice++] = seldigito[I];
        }
        }
            LimpiarDigitos();
        }
        MostrarOrdenados();
    }
        private void LimpiarDigitos(){
        for(int k = 0; k < digitos.Count; k++){
            digitos[k].Clear();
        }
    }
        public void MostrarOrdenados(){
        Console.WriteLine("=-=-=-=-= Mostrando datos en forma ascendente =-=-=-=-=");
        for(int i = 0; i < numeros.Length; i++){
            Console.WriteLine(numeros[i]);
        }
    }
        static void Main(string[] args)
        {
            new Program().SortRaiz();
            Console.ReadLine();
        }
    }
}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace shell_ascendente
{
    class Program
    {
        private int[] empleados;
        public void Ingresar(){
        empleados = new int [15];
        for (int f = 0; f< empleados.Length; f++){
            Console.WriteLine("Ingresa el elemento " + (f+1) + ": ");
            empleados[f] = Convert.ToInt16(Console.ReadLine());
        }
    }
        public void MetodoShell(){
        int salto, flag, aux, contador = 0;
        salto = empleados.Length/2;
        while (salto > 0){
            flag = 1;
            while (flag != 0){
                flag = 0;
                contador = 1;
                while(contador <= (empleados.Length - salto)){
                    if (empleados[contador - 1] > empleados[(contador - 1) + salto]){
                        aux = empleados[(contador - 1) + salto];
                        empleados[(contador - 1) + salto] = empleados[contador - 1];
                        empleados[(contador - 1)] = aux;
                        flag = 1;
                    }
                    contador++;
                }
            }
            salto = salto/2;
        }
    }
        public void Imprimir(){
        for (int f = 0; f < empleados.Length; f++){
            Console.Write(empleados[f] + "  ");
        }
    }
        static void Main(string[] args)
        {
            Program ob_os = new Program();
            Console.Title = "Ordenamiento ascendente por Shell";
            Console.WriteLine("=-=-=-=-= Ingresando valores =-=-=-=-=");
            Console.WriteLine("");
            ob_os.Ingresar();
            Console.WriteLine("");
            Console.WriteLine("=-=-=-=-= Valores ingresados =-=-=-=-=");
            Console.WriteLine("");
            ob_os.Imprimir();
            Console.WriteLine("");
            Console.WriteLine("Presione cualquier tecla para mostrar de forma ascendente.");
            Console.ReadKey();
            Console.WriteLine("");
            Console.WriteLine("=-=-=-=-= Mostrando ordenados en forma ascendente =-=-=-=-=");
            Console.WriteLine("");
            ob_os.MetodoShell();
            ob_os.Imprimir();
        }
    }
}










