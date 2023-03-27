package utilidades;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Clase <code>Leer</code> la cuál nos permite leer por teclado diferentes tipos de datos
 * @since 1.0
 * @version 1.0
 * @author SebastiánMillán
 *
 */

public class Leer{
	/**
	 * 
	 * @return Cadena de carácteres
	 */
 public static String dato()
  {
  String sdato=" ";
  try{
  	 InputStreamReader isr=new InputStreamReader(System.in);
  	 BufferedReader flujoE = new BufferedReader(isr);
  	 sdato=flujoE.readLine();
  	 }
  catch (IOException e)
  	{
  	System.out.println("Error "+e.getMessage());
  	}
  return sdato;
  
  }
/**
 * 
 * @return número entero
 */
 public static int datoInt()
  {
  return Integer.parseInt(dato());
  }
  
/**
 * 
 * @return número decimal
 */
 public static float datoFloat()
  {
  return Float.parseFloat(dato());	
  }
//Leer un char por teclado
/**
 * 
 * @return una letra/un carácter
 */
public static char datoChar( ){
	char c = ' ';
		try {
			java.io.BufferedInputStream b = new BufferedInputStream(System.in);
			 c = (char) b.read();
		} catch (IOException e) {
			System.out.println("Error al leer");
			e.printStackTrace();
		}
	return c;
	}
 /**
  * 
  * @return número entero
  */
 public static long datoLong()
  {
  return Long.parseLong(dato());
  }
 /**
  * 
  * @return número entero
  */
 public static short datoShort()
  {
  return Short.parseShort(dato());	
  }
 /**
  * 
  * @return número decimal
  */
 public static double datoDouble()
  {
  return Double.parseDouble(dato());	
  }
  
}
