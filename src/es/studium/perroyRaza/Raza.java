/* Clase 12�-1 11012023 48� */
package es.studium.perroyRaza;

public class Raza
{
	// Atributo
	private String nombreRaza;
	
	// Constructor por defecto o constructor vac�o
	public Raza()
	{
		nombreRaza = "";
	}

	// Constructor por par�metros
	public Raza(String nombreRaza)
	{
		this.nombreRaza = nombreRaza;
	}

	// M�todos getters and setters
	public String getNombreRaza()
	{
		return nombreRaza;
	}

	public void setNombreRaza(String nombreRaza)
	{
		this.nombreRaza = nombreRaza;
	}

	// M�todo toString
	@Override
	public String toString()
	{
		return "Raza [nombreRaza=" + nombreRaza + "]";
	}
}