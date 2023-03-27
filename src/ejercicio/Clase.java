/**
 * Licencia
 */
package ejercicio;

import java.util.Iterator;
import java.util.Set;
/**
 * En esta clase <code>Clase</code> tendremos alumnos
 * @version 1.0
 * @since 1.1
 * @author SebastiánMillán
 * @see java.util.Set
 * @see java.lang.String
 *
 */
public class Clase {

	/**
	 * El nombre de la clase
	 */
	private String nombre;
	/**
	 * La Colección <code>Set</code> llamada lista que almacenará los diferentes Alumnos
	 */
	private Set<Alumno> lista;

	public Clase(String nombre, Set<Alumno> lista) {
		super();
		this.nombre = nombre;
		this.lista = lista;
	}
	/**
	 * Método que devuelve el nombre de la Clase en cuestión
	 * @return El nombre de la Clase
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Método que modifica el nombre de la clase por un nombre pasado como parámetro.
	 * @param nombre El nuevo para ser sustituido
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Método que devuelve la Colección tipo <code>Set</code> de Alumnos
	 * @return la colección de Alumnos
	 */
	public Set<Alumno> getLista() {
		return lista;
	}
	/**
	 * Método que modifica la Colección tipo <code>Set</code> por otra igual pasada como parámetro
	 * @param lista La nueva que será sustituida
	 */
	public void setLista(Set<Alumno> lista) {
		this.lista = lista;
	}
	/**
	 * Método que devuelve los datos de todos los atributos
	 * @return una cadena de caracteres con los datos de todos los atributos de la Clase
	 */
	@Override
	public String toString() {
		return "Clase [nombre=" + nombre + ", lista=" + lista + "]";
	}
	/**
	 * Método que imprime mediante un for mejorado los diferentes Alumnos de la Clase
	 */
	public void imprimirAlumnosV1() {
		int contador=0;
		
		for(Alumno a : lista) {
			contador++;
			System.out.println(contador+" - "+a);
		}
	}
	/**
	 * Método que imprime Alumnos mediante un Iterator
	 */
	public void imprimirAlumnosV2() {
		int contador=0;
		Iterator<Alumno> it = lista.iterator();
		
		while(it.hasNext()) {
			contador++;
			System.out.println(contador+" - "+it.next());
		}
	}
	/**
	 * Método que recorre la colección y calcula la nota media entre todos los Alumnos
	 * @return la nota media de la Clase
	 */
	public double calcularNotaMed() {
		double notaTotal=0.0;
		for(Alumno a : lista) {
			notaTotal+=a.getNotaMedia();
		}
		return notaTotal/lista.size();
	}
	/**
	 * Calcula el número de suspensos
	 * @return número de suspensos
	 */
	public int calcularNumSusp() {
		int numSusp=0;
		Iterator<Alumno> it= lista.iterator();
		
		while(it.hasNext()) {
			if(it.next().getNotaMedia()<5) {
				numSusp++;
			}
		}
		return numSusp;
	}
	/**
	 * Método que recorre la colección y contabiliza el número de Alumnos aprobados
	 * @return el número de aprobados de la Clase
	 */
	public int calcularNumAprob() {
		int numAprob=0;
		for(Alumno a : lista) {
			if(a.getNotaMedia()>=5) {
				numAprob++;
			}
		}
		return numAprob;
	}
	
}
