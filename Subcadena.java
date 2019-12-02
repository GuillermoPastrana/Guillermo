public class Subcadena{
	public static void main(String[] args){
		
		// Mensaje  de error || intentar de nuevo
		if(args.length > 0){
		
			String cadenaOriginal = args[0];
			String subcadena = "";
		
			if(cadenaOriginal.length() < 2){
			System.out.println(cadenaOriginal);
			}else{
			subcadena = cadenaOriginal.substring(0,2);
			System.out.println("La subcadena es " + subcadena);
			}
			
		}else{
			System.out.println("Intentar de nuevo");
		}
	}
}
