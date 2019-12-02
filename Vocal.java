import java.util.Scanner;

public class Vocal{
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		char letra;
		
		System.out.println("Introduce una palabra");
		letra = scan.next().charAt(0);
		
		switch(letra){	
        case 'a': case 'e': case 'i': case 'o': case 'u':
            System.out.println(letra + " Es una vocal");
            break;
        default:
            System.out.println(letra + " Es una consonante");
            break;
        }
	}
}
