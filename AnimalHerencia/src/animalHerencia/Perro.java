package animalHerencia;

public class Perro extends Animal{
	//Atributos
	protected String raza;
	protected String color;
	
	//Constructores
	public Perro() {
		
	}
	
	public Perro(String nombre, boolean esMamifero, double peso, String lugarRecogida, String raza, String color) {
		super(nombre, esMamifero, peso, lugarRecogida);
		this.raza = raza;
		this.color = color;
	}
	
	//Getter and setters

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	//Metodos
	
	public String mostrarPerro() {
		System.out.println(super.mostrarAnimal());
		return "Raza: "+this.getRaza()+
				"\nColor: "+this.getColor();
	}
	
	public String sonidoAnimal() {
		System.out.println(super.sonidoAnimal());
		return "Guau guau";
	}

}
