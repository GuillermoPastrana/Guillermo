//Ejercicio 3
import java.util.Scanner;

public class ParImpar{
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		
		int numero; 
		
		System.out.println("Introduce un numero: ");
		numero = scan.nextInt();
	
		if (numero%2==0){
        System. out. println("El número es par");
		}
		else{
		System. out. println("El número es impar");	
		}
	}
}