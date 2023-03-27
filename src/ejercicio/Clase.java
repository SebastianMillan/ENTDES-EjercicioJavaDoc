/**
 * Licencia
 */
package ejercicio;

import java.util.Iterator;
import java.util.Set;

/**
 * Esta clase define objetos de tipo {@code Clase} donde almacena el nombre de la misma junto a un conjunto
 * de {@code Alumnos} que la conforman
 * 
 * @since 1.0
 * @version 1.0
 * @author SebastiánMillán
 * @see java.lang.String
 * @see java.util.Set
 * @see java.util.Iterator
 *
 */
public class Clase {

	/**
	 * El nombre de la clase
	 */
	private String nombre;
	/**
	 * La Colección {@code Set} llamada lista que almacenará los diferentes Alumnos
	 */
	private Set<Alumno> lista;
	/**
	 * Constructor para la Clase
	 * @param nombre el nombre de la clase que se va a crear
	 * @param lista	la colección que almacenará los Alumnos
	 * 
	 */
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
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Método que devuelve la Colección tipo {@code Set} de Alumnos
	 * @return la colección de Alumnos
	 */
	public Set<Alumno> getLista() {
		return lista;
	}
	/**
	 * Método que modifica la Colección tipo {@code Set} por otra igual pasada como parámetro
	 * @param lista
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
	 * Método que imprime mediante un iterator los diferentes Alumnos de la Clase
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
	 * Método que recorre la colección y contabiliza el número de Alumnos suspensos
	 * @return el número de suspensos de la Clase
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
