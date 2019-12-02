import java.util.Scanner;

public class SRMD {
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		
		double uno;
		double dos;
		double suma,resta,mult,div;
		
		System.out.println("Primer Numero: ");
		uno = scanner.nextDouble();
		System.out.println("Segundo Numero: ");
		dos = scanner.nextDouble();
		
		suma =  uno + dos;
		resta = uno - dos;
		mult = uno * dos;
		div = uno / dos;
		
		System.out.println(("La suma es: ") + suma +
						   ("\nLa resta es: ") + resta +
						   ("\nla multiplicacion es: ") + mult +
						   ("\nLa division es: ") + div);	
	}
}
