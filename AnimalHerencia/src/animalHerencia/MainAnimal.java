package animalHerencia;

public class MainAnimal {
	public static void main(String[] args) {
		Perro perro1 = new Perro("Ori", true, 5.5, "Casa de acogida", "Europeo", "Marrón");
		Pajaro pajaro1 = new Pajaro("Perico", false, 0.1, "Parque", "Larga", "Corto");
		
		System.out.println(perro1.mostrarPerro());
		System.out.println(perro1.sonidoAnimal());
		System.out.println("====================================");
		System.out.println(pajaro1.mostrarPajaro());
		System.out.println(pajaro1.sonidoAnimal());
	}
}
