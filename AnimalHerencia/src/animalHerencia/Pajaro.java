package animalHerencia;

public class Pajaro extends Animal{
	//Atributos
	protected String pluma;
	protected String pico;
	
	//Constructores
	public Pajaro() {
		
	}
	
	public Pajaro(String nombre, boolean esMamifero, double peso, String lugarRecogida, String pluma, String pico) {
		super(nombre, esMamifero, peso, lugarRecogida);
		this.pluma = pluma;
		this.pico = pico;
	}

	public String getPluma() {
		return pluma;
	}

	public void setPluma(String pluma) {
		this.pluma = pluma;
	}

	public String getPico() {
		return pico;
	}

	public void setPico(String pico) {
		this.pico = pico;
	}
	
	//Metodos
	
	public String mostrarPajaro() {
		System.out.println(super.mostrarAnimal());
		return "Tipo de Pluma: "+this.getPluma()+
				"\nTipo de Pico: "+this.getPico();
	}
	
	public String sonidoAnimal() {
		System.out.println(super.sonidoAnimal());
		return "Pio Pio";
	}
}
