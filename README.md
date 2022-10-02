# U1-HOJA-Ejercicio-6
par o impar con boooooleanos..

```java
/*
6. Escribir un programa que pida un número al usuario e 
indique mediante un literal booleano si el número es par.
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
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
```
![666](https://user-images.githubusercontent.com/80227002/193478348-bf65e80b-c315-4bd5-b460-d693a7da268a.png)

![666](https://user-images.githubusercontent.com/80227002/193478312-1c235379-30c8-4377-a2f5-5927bb82a5c8.png)

