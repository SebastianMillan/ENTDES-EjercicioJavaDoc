package ejercicio;

import java.util.HashSet;
import java.util.Set;
import utilidades.Leer;
/**
 * Clase Principal en la cuál se ejecutan los diferentes métodos vistos en la clase <code>Clase</code> 
 * @since 1.0
 * @version 1.0
 * @author SebastiánMillán
 *
 */
public class Principal {

	public static void main(String[] args) {

		//Declaración de los diferentes Objetos y variables primitivas
		
		int opcion=0;
		Alumno a1= new Alumno("Sebastián","Millán","26/07/2000","1ab",8);
		Alumno a2= new Alumno("Fernando","Claro","16/12/2002","2cd",9);
		Alumno a3= new Alumno("Manolo","Sevillista","20/20/1965","3ef",3);
		Set<Alumno> lista= new HashSet<Alumno>();
		Clase cla;
		
		//Se rellena la lista Set con los tres alumnos de ejemplo
		lista.add(a1);
		lista.add(a2);
		lista.add(a3);
		cla= new Clase("1DAM",lista);

		
		do {
			//Menú para realizar las distintas acciónes del programa
			System.out.println("-----------");
			System.out.println(" MENÚ");
			System.out.println("1 - Mostrar alumnos");
			System.out.println("2 - Calcular nota media total");
			System.out.println("3 - Calcular número de suspensos");
			System.out.println("4 - Calcular número de aprobados");
			System.out.println("0 - Salir");
			System.out.println("-----------");
			opcion=Leer.datoInt();
			switch(opcion) {
				case 1:
					//Imprime todos los Alumnos que se encuentren en la lista
					cla.imprimirAlumnosV1();
					break;
				case 2:
					//Calcula e imprime la nota media de la Clase
					System.out.printf("Nota media de la clase: %.2f\n", cla.calcularNotaMed());
					break;
				case 3:
					//Contabiliza e imprime el número de suspensos de la Clase
					System.out.println("El número de suspensos es: "+cla.calcularNumSusp());
					break;
				case 4:
					//Contabiliza e imprime el número de aprobados de la Clase
					System.out.println("El número de aprobados es: "+cla.calcularNumAprob());
					break;
				case 0:
					System.out.println("Saliendo del programa");
					break;
				default:
					System.out.println("Opción del menú errónea");
					break;
			}
		}while(opcion!=0);
	
		System.out.println("--------------------------------");
		System.out.println("Gracias por utilizar el programa");
	}

}
