public class NumeroPar{
	public static void main (String[] args){
		int valorEntero = Integer.valueOf(args[0]);
		double valorDecimal = Double.valueOf(args[1]);
		boolean esPar = valorEntero%2 == 0;
		
		if(esPar==true){
			System.out.println("El numero " + valorEntero + " esPar");
		}else{
			System.out.println("El numero " + valorEntero + " esImpar");
		}
		
		System.out.println("El segundo valor en decimal es =" + (valorDecimal + 10.5));
	}
}