package bucle;

import java.util.Scanner;

public class Bucle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1,n2,r;
        
        do{
            System.out.println("Introduce primer numero: ");
            n1 = scan.nextInt();
            System.out.println("Introduce segundo numero: ");
            n2 = scan.nextInt();
            r = n1+n2;
            System.out.println("El resultado es "+ r);
            
            System.out.println("Desea continuar sumando \n Si = 1 || No = 0");
            r = scan.nextInt();
        }
        while(r!=0);
    }
}
