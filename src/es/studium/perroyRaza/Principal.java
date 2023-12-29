// Clase 12º-1 11012023 49º
package es.studium.perroyRaza;

public class Principal
{
	public static void main(String[] args)
	{
		// Crear objetos de tipo Raza usando el constructor por parámetros
		Raza raza1 = new Raza("Dálmata");
		// Crear objetos de tipo Perro usando el constructor por parámetros
		Perro perro1 = new Perro(raza1, 1.2f, 10, "blanco y negro.");
		System.out.println("El perro de raza " + perro1.getRaza().getNombreRaza() + ", mide " + perro1.getTamanio() + " metros, tiene " + perro1.getEdad() + " años, y es de color " + perro1.getColor());
		
		// Vamos a sacar la información de los valores de los atributos pero utilizando el toString. Para ello ponemos el nombre del objeto
		System.out.println(perro1.toString());
	}
}