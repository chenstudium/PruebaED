// Clase 12�-1 11012023 49�
package es.studium.perroyRaza;

public class Principal
{
	public static void main(String[] args)
	{
		// Crear objetos de tipo Raza usando el constructor por par�metros
		Raza raza1 = new Raza("D�lmata");
		// Crear objetos de tipo Perro usando el constructor por par�metros
		Perro perro1 = new Perro(raza1, 1.2f, 10, "blanco y negro.");
		System.out.println("El perro de raza " + perro1.getRaza().getNombreRaza() + ", mide " + perro1.getTamanio() + " metros, tiene " + perro1.getEdad() + " a�os, y es de color " + perro1.getColor());
		
		// Vamos a sacar la informaci�n de los valores de los atributos pero utilizando el toString. Para ello ponemos el nombre del objeto
		System.out.println(perro1.toString());
	}
}