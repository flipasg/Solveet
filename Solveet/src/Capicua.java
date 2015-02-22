
public class Capicua {
	
	public static long calcularCapicua(long n){
		//Generamos un objeto de tipo String para facilitar la inversi�n del n�mero
		String numero = Long.toString(n);
		
		/*
		 * Si la longitud del n�mero es inferior a 2, no podremos calcular el capic�a
		 * Devolveremos -1
		 */
		if(numero.length()<2){
			return -1;
		}else{
			 // Si la longitud es mayor calculamos la suma del n�mero y su inverso
			long suma = 0;
			
			/*
			 * Generamos un objeto StringBuilder que nos permite manipular el String
			 * As� usando la funci�n reverse() del "builder" obtendremos el n�mero inverso
			 */
			StringBuilder builder = new StringBuilder(numero);
			
			//Calculamos la suma
			suma = Long.parseLong(numero)+Long.parseLong(builder.reverse().toString());
			builder = new StringBuilder(Long.toString(suma));
			
			/*
			 * Instanciamos en el mismo objeto StringBuilder uno sobre la suma
			 * O creamos otro objeto para poder invertirlo y saber si la cadena es capicua
			 */
			if(Long.toString(suma).equals(builder.reverse().toString())){
				//Si la suma es capicua devolvemos el n�mero
				return suma;
			}else{
				//Si la suma no es capicua llamamos recursivamente a esta funci�n
				return calcularCapicua(suma);
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println(calcularCapicua(187));
	}
}
