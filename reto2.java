
package pruebasbanco;
/*
* Write a function that takes in a non-empty array of integers sorted in ascending order and returns a
new array of the same length with the squares of the original integers

* also sorted in ascending order. 

* If the output number is out of the range [0, SS] (for S=6 the range will be [0, 66]), you will
delete it of the output array. 

Please, don’t use built-in sort of your language.
Examples with S=6:
> {"array": [1, 2, 3, 5, 6, 8, 9]} -> [1, 4, 9, 25, 36, 64]
> {"array": [-2, -1]} -> [1, 4]
> {"array": [-6, -5, 0, 5, 6]} -> [0, 25, 25, 36, 36]
> {"array": [-10, 10]} -> []
*/
import java.util.*;

public class reto2 {
    
     /*public static void main(String[] args) {
        int S = 6;// se crea la variable S
        //int[] list = {1, 2, 3, 5, 6, 8, 9}; // Se crea la matriz de datos
        int[] list = {-2, -1}; 

        List<Integer> result = new ArrayList<>(); //Se crea una lista llamada result
//Se crea un ciclo for para recorrer la matriz y luego almacenaar los datos en la variable temporal num por cada recorrido
    // se crea la variable square(cuadrado) donde se realiza la ecuacion para hallar el cuadrado del numero
    // se pone una condicion if que permita almacenar en la lista los numeros que no sean mayores de S*S
        for (int num : list) {
            int square = num * num;
            if (square >= 0 && square <= S * S) {
                result.add(square);
            }
        }

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
*/
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int S; // Valor de S
        List<Integer> inputArray = new ArrayList<>(); // Lista de entrada

        // Solicitar el valor de S al usuario
        System.out.print("Ingrese el valor de S: ");
        S = scanner.nextInt();

        // Solicitar los números al usuario hasta que ingrese -0
        System.out.println("Ingrese los números en orden ascendente (ingrese -0 para terminar): ");
        int num;
        while (true) {
            num = scanner.nextInt();
            if (num == -0) {
                break;
            }
            inputArray.add(num);
        }

        List<Integer> result = squareAndFilter(inputArray, S);
        
        //este metodo permite ordenar el resultado de manera ascendente
        Collections.sort(result);

        // Imprimir el resultado
        System.out.println("Resultado:");
        for (int square : result) {
            System.out.print(square + " ");
        }
    }

    public static List<Integer> squareAndFilter(List<Integer> inputArray, int S) {
    List<Integer> result = new ArrayList<>();

    for (int num : inputArray) {
        int square = num * num;

        if (square >= 0 && square <= S * S) {
            result.add(square);
        }
    }

    return result;
    
    }

}
