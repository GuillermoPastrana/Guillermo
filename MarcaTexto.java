import java.util.Scanner;

public class MarcaTexto{
		
		
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int valor;
		
		System.out.println("Introduce el valor: ");
		valor = scan.nextInt();
	
		while(valor < 5){
			System.out.println("Suspenso");
			break;
		}
		while(valor == 5){
			System.out.println("Aprobado");
			break;
		}
		while(valor == 6){
			System.out.println("Bien");
			break;
		}
		while(valor == 7 || valor == 8){
			System.out.println("Notable");
			break;
		}
		while(valor == 9 || valor ==10){
			System.out.println("Sobresaliente");
			break;
		}
	}
}
		