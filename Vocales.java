package vocales;

import java.util.Scanner;

public class Vocales {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Palabra;
        int Lector = 0;

        System.out.println("Introduce una palabra");
        Palabra = scan.nextLine();
        for (int i = 0; i < Palabra.length(); i++) {
            if ((Palabra.charAt(i) == 'a') || (Palabra.charAt(i) == 'e') || (Palabra.charAt(i) == 'i')
                    || (Palabra.charAt(i) == 'o') || (Palabra.charAt(i) == 'u')) {
                Lector++;
            }
        }
        System.out.println("La palabra " + Palabra + " contiene " + Lector + " vocales");
    }
}
