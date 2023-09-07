
package pruebasbanco;
/*
Given an array of positive integers representing the values of coins in your possession, write a
function that returns the minimum amount of change (the minimum sum of money) that you
CANNOT give change. The given coins can have any positive integer value and aren't necessarily
unique (i.e., you can have multiple coins of the same value). You can use built-in sort of your
language.
Hint 1
One approach to solve this problem is to attempt to create every single amount of change, starting
at 1 and going up until you eventually can’t create an amount. While this approach works, there is
a better one.
Hint 2
Start by sorting the input array. Since you’re trying to find the minimum amount of change that you
can’t create, it makes sense to consider the smallest coins first.
Hint 3
To understand the trick to this problem, consider the following example: coins = [1, 2, 4]. With this
set of coins, we can create 1, 2, 3, 4, 5, 6, 7 cents worth of change. Now, if we were to add a coin of
value 9 to this set, we would not be able to create 8 cents. However, if we were to add a coin of
value 7, we would be able to create 8 cents, and we would also be able to create all values of
change from 1 to 15. Why is this the case?
Examples:
> {"coins": [5, 7, 1, 1, 2, 3, 22]} -> 20
> {"coins": [1, 1, 1, 1, 1]} -> 6
> {"coins": [1, 5, 1, 1, 1, 10, 15, 20, 100]} -> 55
*/
import java.util.*;

public class reto3 {
    /*
    public static void main(String[] args) {
        int[] coins = {5, 7, 1, 1, 2, 3, 22}; // Cambia el arreglo de monedas según tus necesidades
        //int[] coins = {1,5,1,1,1,10,15,20,100};
        int result = findMinChange(coins);
        System.out.println(result);
    }

    public static int findMinChange(int[] coins) {
        Arrays.sort(coins); // Ordena el arreglo de monedas
        int minChange = 1;

        for (int coin : coins) {
            if (coin > minChange) {
                break;
            }
            minChange += coin; // Actualiza el mínimo cambio posible
        }

        return minChange;
    }
    */
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de monedas: ");
        int n = scanner.nextInt();
        
        int[] coins = new int[n];

        System.out.println("Ingrese los valores de las monedas uno por uno:");
        for (int i = 0; i < n; i++) {
            coins[i] = scanner.nextInt();
        }

        int result = findMinChange(coins);
        System.out.println("El mínimo cambio que no puedes dar es: " + result);
    }

    public static int findMinChange(int[] coins) {
        Arrays.sort(coins); // Ordena el arreglo de monedas de manera ascendente
       // "coins": [1, 1, 2, 3, 5, 7, 22]} -> 20
        int minChange = 1;
                   //5          1 2 3 4 5
                   
                   //20          1 2 3 4 5 6
                   
        for (int coin : coins) {
            if (coin > minChange) {
                //22 > 20
                break;
            }
            minChange += coin; // Actualiza el mínimo cambio posible
            //minChange = 5 + 1 = 6
            
            //minChange = 13 + 7 = 20
            
            //"coins": [5, 7, 1, 1, 2, 3, 22]} -> 20
        }

        return minChange;
    }
}

