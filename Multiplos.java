package multiplos;

import java.util.Scanner;
public class Multiplos {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int SumaTotal = 0;
        
        System.out.println("Introduce el numero:");
        int Numero = scan.nextInt();
       
        for (int i = 1; i < Numero; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                SumaTotal = i + SumaTotal;
            }
        }

        System.out.println(SumaTotal);
    }

}

