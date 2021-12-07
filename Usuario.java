package constructor;

public class Usuario {
	//Mis atributos
	String usuario;
	int edad;
	
	//Mi método constructor
	public Usuario (String Cnombre, int Cedad) {
		usuario = Cnombre;
		edad = Cedad;
	}
	//Mostramos variables
	public void datosConstructor() {
		System.out.println("Tu usuario es "+usuario+" y tu edad es "+edad);
	}
}
