package pruebasbanco;
/*
* Having a list of n numbers with digits in range [0, S], where n <= 100, switch all list positions in O(n)
time.

* If the input number contains a digit greater or equal than S, you will delete the digit from the
number, for example with S=6, 61 becomes 1, and 6 will be deleted from the array. 

* The result should be printed in console/terminal. 

Please, don’t use built-in sort of your language.
Examples with S=6:
> [1, 2, 3, 4, 5, 6] -> [5, 4, 3, 2, 1]
> [10, 20, 30, 40] -> [40, 30, 20, 10]
> [6] -> []
> [66] -> []
> [65] -> [5]
> [6, 2, 1] -> [1 , 2]
> [60, 6, 5, 4, 3, 2, 7, 7, 29, 1] -> [1, 2, 2, 3, 4, 5, 0]

    numbers.add(1);
        numbers.add(2);
        //numbers.add(3);
        //numbers.add(4);
        //numbers.add(5);
        numbers.add(6);
        //numbers.add(66);
        //numbers.add(65);
        //numbers.add(60);
        //numbers.add(7);
        //numbers.add(7);
        //numbers.add(29);
*/
import java.util.*;

public class reto1 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int S; // Valor de S
        List<Integer> numbers = new ArrayList<>(); // Lista de números

        // Solicitar el valor de S al usuario
        System.out.print("Ingrese el valor de S: ");
        S = scanner.nextInt();

        // Solicitar los números al usuario hasta que ingrese -1
        System.out.println("Ingrese los números (ingrese -1 para terminar): ");
        int num;
        /*
        Se usa un ciclo while para crear un codicion, que permita registrar al usuario
        la cantidad de numeros que desea, para que el usuario finalizace el registro se solicita
        que ingrese el valor -1, cada vez que esta condicion se repita se registrara el numero 
        digitado, almacenandolo en la lista creada "numbers" tomando el dato que se encuentre en la variable "num"
        */
        while (true) {
            num = scanner.nextInt();
            if (num == -1) {
                break;
            }
            numbers.add(num);
        }

        // Transformar los números según las reglas.
        /*
        Luego, se inicia un nuevo bucle for para recorrer cada número en la lista numbers.
        Para cada número, se realiza la siguiente transformación:
        originalNumalmacena el número original.
        transformedNumse inicializa en 0 para construir el nuevo número transformado.
        multiplier se utiliza para construir el número transformado al multiplicar por 10 en cada iteración.
        Se utiliza un bucle while para descomponer originalNum en dígitos y aplicar la transformación:
        digitobtiene el dígito menos significativo de originalNum.
        Se verifica si digites menor que S. Si es así, se agrega al transformedNum, y multiplierse multiplica por 10 para considerar el siguiente dígito.
        Luego, se elimina el dígito menos significativo de originalNumdividirlo por 10.
        Se actualiza el número en la lista numbers con el transformedNum.
        */
        for (int i = 0; i < numbers.size(); i++) {
            int originalNum = numbers.get(i);
            int transformedNum = 0;
            int multiplier = 1;

            while (originalNum > 0) {
                int digit = originalNum % 10;
                originalNum /= 10;

                if (digit < S) {
                    transformedNum += digit * multiplier;
                    multiplier *= 10;
                }
            }

            numbers.set(i, transformedNum);
        }
//System.out.print(numbers);
        // Imprimir el resultado sin espacio adicional
        /*Después de procesar todos los números de la lista, 
        se imprime el resultado sin espacio adicional. 
        Se itera sobre la lista y se imprime cada número, 
        seguido de un espacio si no es el último número.*/
        //Ciclo for para resultados de manera ascendente
       /* 
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i));
            if (i <= numbers.size()-1) {
                System.out.print(" ");
            }
        }
        */
       //Ciclo for para resultados de manera descendente
       System.out.println("Resultado:");
       for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.print(numbers.get(i));
            if (i >= 0) {
                System.out.print(" ");
            }
        }
    }
}

