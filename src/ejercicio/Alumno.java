package ejercicio;

import java.util.Objects;
/**
 * Clase POJO Alumno la cuál define las caracteristicas que 
 * @since 1.0
 * @version 1.0
 * @author SebastiánMillán
 *
 */
public class Alumno {

	private String nombre;
	private String apellido;
	private String fechaNacimiento;
	private String dni;
	private double notaMedia;
	
	public Alumno(String nombre, String apellido, String fechaNacimiento, String dni, double notaMedia) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.dni = dni;
		this.notaMedia = notaMedia;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public double getNotaMedia() {
		return notaMedia;
	}
	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}
	
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento + ", dni="
				+ dni + ", notaMedia=" + notaMedia + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellido, dni, fechaNacimiento, nombre, notaMedia);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(apellido, other.apellido) && Objects.equals(dni, other.dni)
				&& Objects.equals(fechaNacimiento, other.fechaNacimiento) && Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(notaMedia) == Double.doubleToLongBits(other.notaMedia);
	}
	
}
