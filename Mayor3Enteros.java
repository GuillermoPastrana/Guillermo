package mayor3enteros;

import java.util.Scanner;

public class Mayor3Enteros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;
        
        System.out.print("Ingrese primer número: ");
        n1 = sc.nextInt();
        System.out.print("Ingrese segundo número: ");
        n2 = sc.nextInt();
        System.out.print("Ingrese tercer número: ");
        n3 = sc.nextInt();
        if (n1 > n2) {
            if (n1 > n3) {
                System.out.println("El mayor es: " + n1);
            } else {
                System.out.println("El mayor es: " + n3);
            }
        } else if (n2 > n3) {
            System.out.println("El mayor es: " + n2);
        } else {
            System.out.println("El mayor es: " + n3);
        }
    }
}  
