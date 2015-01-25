package equilibrado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StaticMethods {
	
	private static int invertir(int n){
		String num = Integer.toString(n);
		String inv = "";
		
		for (int i = num.length()-1; i >= 0; i--) {
			inv+=num.charAt(i);
		}
		
		return Integer.parseInt(inv);
	}
	
	public static void calcularEquilibrado() throws NumberFormatException, IOException{
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Dime un n�mero");
		int numero = Integer.parseInt(b.readLine());
		
		System.out.println("El n�mero equilibrado es: "+(invertir(numero)+numero));
	}
}
