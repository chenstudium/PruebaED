/* Clase 12º-1 11012023 48º */
package es.studium.perroyRaza;

public class Raza
{
	// Atributo
	private String nombreRaza;
	
	// Constructor por defecto o constructor vacío
	public Raza()
	{
		nombreRaza = "";
	}

	// Constructor por parámetros
	public Raza(String nombreRaza)
	{
		this.nombreRaza = nombreRaza;
	}

	// Métodos getters and setters
	public String getNombreRaza()
	{
		return nombreRaza;
	}

	public void setNombreRaza(String nombreRaza)
	{
		this.nombreRaza = nombreRaza;
	}

	// Método toString
	@Override
	public String toString()
	{
		return "Raza [nombreRaza=" + nombreRaza + "]";
	}
}