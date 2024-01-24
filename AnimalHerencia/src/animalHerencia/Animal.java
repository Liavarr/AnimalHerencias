package animalHerencia;

public class Animal {
	//Atributos
	protected String nombre;
	protected boolean esMamifero;
	protected double peso;
	protected String lugarRecogida;
	
	
	//Constructores
	public Animal(){
	}
	
	
	//Getter and setters
	public Animal(String nombre, boolean esMamifero, double peso, String lugarRecogida){
		this.nombre = nombre;
		this.esMamifero = esMamifero;
		this.peso = peso;
		this.lugarRecogida = lugarRecogida;
	}

	public String getLugarRecogida() {
		return lugarRecogida;
	}


	public void setLugarRecogida(String lugarRecogida) {
		this.lugarRecogida = lugarRecogida;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean getEsMamifero() {
		return esMamifero;
	}

	public void setEsMamifero(boolean esMamifero) {
		this.esMamifero = esMamifero;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	//Metodos extras:
	
	public String mostrarAnimal() {
		String mamifero = (this.getEsMamifero()) ? "Sí" : "No";
		return "Nombre: "+this.getNombre()+
				"\n¿Es Mamífero?: "+mamifero+
				"\nLugar de Recogida: "+ this.getLugarRecogida();
	}
	
	public String sonidoAnimal() {
		return "Este animal hace...";
	}

}
