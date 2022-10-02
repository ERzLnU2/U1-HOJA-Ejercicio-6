/**
6. Escribir un programa que pida un número al usuario e 
indique mediante un literal booleano si el número es par.
@author Daw120
 */
package com.solomongo.ejercicio6_daw120;
import java.util.Scanner;
public class Ejercicio6_DAW120 {
   public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in); 
    int numero;
    System.out.print( "\nEscribe un numero: " );
    numero=teclado.nextInt();
       boolean total;
       total = numero % 2 == 0;
       String total2;
       total2 = total==true? " par": " impar";
         System.out.print("El numero "+numero+" es ");
            System.out.print(total2+" ("+total+ ").\n");     
    }
}
/*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@BGGGGGGGGGGGGGGGGBBB#&@@@@@@@@@@@@@@@@@@@
@@@@@@@@@B                     .~Y&@@@@@@@@@@@@@@@
@@@@@@@@@@&:                       ^G@@@@@@@@@@@@@
@@@@@@@@@@@@7.:::::::::::::.         ~&@@@@@@@@@@@
@@@@@@@@@@@@@@@B?JJJJJP@@@@@@#?       .&@@@@@@@@@@
@@@@@@@@@@@@@@@J      .@@@@@@@@&:      !@@@@@@@@@@
@@@@@@@@@@@@@@@J      :@@@@@@@@@#       &@@@@@@@@@
@@@@@@@@@@@@@@@J      :@@@@@@@@@@       &@@@@@@@@@
@@@@@@@@@@@@@@@J      :@@@@@@@@@P      .@@@@@@@@@@
@@@@@@@@@@@@@@@J      :@@@@@@@@P       Y@@@@@@@@@@
@@@@@@@@@@@@@@@J      .&&&&#GJ:       7@@@@@@@@@@@
@@@@@@@@@@@@@@@J                     5@@@@@@@@@@@@
@@@@@@@@@@@@@@@J                  :Y&@@@@@@@@@@@@@
@@@@@@@@@@@@@@@Y            ..^7P&@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*/
