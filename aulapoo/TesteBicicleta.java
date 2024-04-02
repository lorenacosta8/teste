public class TesteBicicleta {
	
	public static void main(String[] args ){
		Bicicleta Lorena = new Bicicleta();
		
		System.out.println("Peso = "+Lorena.peso());
		System.out.println("Roda = "+Lorena.rodas());
		System.out.println("Sentido a = "+Lorena.sentido1());
		System.out.println("Sentido b = "+Lorena.sentido2());
	}
}