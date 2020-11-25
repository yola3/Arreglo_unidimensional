/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo_unidimensional;


import java.util.Scanner;
public class Arreglo_unidimensional {
static Scanner leer = new Scanner(System.in);



    public static void main(String[] args) {
       System.out.println("introdusca el tamaño del arreglo: ");
       int[] vector = new int[leer.nextInt()]; // creamos el arreglo y como su tamaño vamos a recibir el leer
       vector = llenar(vector); // creo el vector y el metodo llenar se encarga de obtener los numeros por teclado y guardarlos
     int opcion = menu(); // esto mostrara el menu, se va recibir la opciony esa opcion se vuelve hacia el main para almacenar la variable opcion
switch (opcion) { // creamos un Swictch con la variable opcion para que nos proporcione una forma sencilla de enviar la ejecución 
case 1:
 System.out.println("La suma de los numeros es:" + sumar(vector));// creamos el caso uno, enviamos mensaje,llamo el metodo sumar y lo envio al vector

 break;
 case 2:
 obtenerpromedio(vector); // se solicta el metodo y se envia los datos al vector
 break;
 case 3:
 mostrarnumeros(vector);
 break;
 default:
 System.out.println("Opcion no valida");
 }
 }

 public static void mostrarnumeros(int a[]) {
 System.out.println("Los numeros del vector son:");
 for (int i = 0; i < a.length; i++) { // se recorre el arreglo completo mostrando los numeros del vector
 System.out.println(a[i]); // imprimimos los indices del arreglos

}
 }
 public static void obtenerpromedio(int a[]) {
 System.out.println("el promedio es" + (sumar(a)) / a.length);// para obtener el promedio utilizo el mismo metodo que me devuelva la cantidad y lo divido por la catidad de numeros 


    }
    
 public static int sumar(int a[]) { // este metodo recibe el arreglo como parametro
 int suma = 0; //inicializamos a nuestra variable
 for (int i = 0; i < a.length; i++) { // creamos un bucle para que recorra el arreglo cada iteracion que encuentre hasta llegar el numero del vector

 suma += a[i]; // ala variable suma le vamos a adicionar lo que ya tenemiamos mas numero en el arreglo

 }
// una vez que finaliza el ciclo retornamos la suma
 return suma;
 }
 public static int[] llenar(int a[]) {
 for (int i = 0; i < a.length; i++) {//se utiliza un bucle for para guardar los datos,y incrementarlo

 System.out.println("ingrese el numero:" + (i + 1));// se solicitan los datos de los indices

 a[i] = leer.nextInt(); //se guarda en el arreglo
 }
 return a; // retorno al arreglo
 }
 //vamos a crear el menu
 public static int menu() {
 System.out.println("Eige una opcion:");
 System.out.println("1.Obtener suma");
 System.out.println("2.Obtener promedio");
 System.out.println("3.Mostrar numeros recibidos");
 return leer.nextInt(); // retornamos para que el numero que se ingrese por el teclado al ver el menu va ser el valor que el metodo retorna hacia el main 

}
}

