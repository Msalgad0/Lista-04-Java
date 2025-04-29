/*
Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X,
um valor por linha, inclusive o
X, se for o caso.
*/

import java.util.Scanner;

public class exe01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero para descobrir os imapres de 1 ate x");
       int x = scanner.nextInt();

       for ( int i =1; i <= x; i++){
           if (i % 2 != 0){
               System.out.println(i);
           }
       }

        scanner.close();
    }
}
