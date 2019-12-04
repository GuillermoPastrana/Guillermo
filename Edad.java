package edad;

import java.util.Scanner;

public class Edad {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Age;
        
        System.out.println("Ingrese la Edad: ");
        Age = scan.nextInt();
        
        if(Age>=18){
            System.out.println("Usted puede votar");
        }
        else{
            System.out.println("No puede votar");
        }
    }
    
}
