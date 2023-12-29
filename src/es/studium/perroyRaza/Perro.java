/* Clase 12�-1 11012023 47� */
package es.studium.perroyRaza;

public class Perro
{
	// Los declaramos todos privados, as� que el modificardor de acceso tiene que ser private
	private Raza raza; // Da error en Raza porque no est� creada la clase Raza. Me pongo sobre el error y me sugiere crear dicha clase
	private float tamanio;
	private int edad;
	private String color;
	
	// Constructor por defecto o constructor vac�o. Lo creamos.
	public Perro()
	{
		// Iniciamos a sus valores nulos los atributos declarados antes seg�n su tipo de dato
		raza = new Raza();
		tamanio = 0.0f; // Tiene que ser con la letra f para que sea float, si no ser�a double
		edad = 0;
		color = "";
	}

	// Constructor por par�metros. Lo generamos utilizando Eclipse. Source> Generate Constructor using Fields> Select All> Generate
	public Perro(Raza raza, float tamanio, int edad, String color)
	{
		this.raza = raza;
		this.tamanio = tamanio;
		this.edad = edad;
		this.color = color;
	}

	// M�todos getters and setters. Lo generamos utilizando Eclipse.
	public Raza getRaza()
	{
		return raza;
	}

	public void setRaza(Raza raza)
	{
		this.raza = raza;
	}

	public float getTamanio()
	{
		return tamanio;
	}

	public void setTamanio(float tamanio)
	{
		this.tamanio = tamanio;
	}

	public int getEdad()
	{
		return edad;
	}

	public void setEdad(int edad)
	{
		this.edad = edad;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	// M�todo toString. Lo generamos utilizando Eclipse. Source> Generate toString> Generate
	// Este m�todo me devuelve un string con la info que aparece en return. As� es c�mo mostrar�a el toString los valores de los atributos de la clase Perro. Es 1 m�todo, como podemos ver nos est� proporcionando Eclipse aqu� 1 anotaci�n que se llama @Override que lo que nos indica es que este m�todo lo estamos sobreescribiendo, no es 1 m�todo propio de la clase Perro, es 1 m�todo de la clase Object, y que la clase Perro lo puede utilizar. Todas las clases heredan de Object 10m30
	// La clase Object es la clase padre de todas las clases JAVA que existen. No tenemos que indicar en 1 clase que extends Object porque por defecto Object es la clase padre de todas las clases, ya sean que desarrollamos nosotros o clases que existen en la api de JAVA
	@Override
	public String toString()
	{
		return "Perro [raza=" + raza + ", tamanio=" + tamanio + ", edad=" + edad + ", color=" + color + "]";
	}	
}