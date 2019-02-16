
	public class SmartPhone {
	
		String marca = "Samsung";
		String modelo = "Galaxy S9";
		String processador = "Octa-core (4x2.8 GHz Kryo 385 Gold & 4x1.7 GHz Kryo 385 Silver)";
		String nucleos = "‎Octa-core";
		String resolucao = "1440 x 2960 pixel";
		String ram = "4 GB";
		String armazenamento = "128 GB";
		String cor = "Ultravioleta";
	
	public void mostrarAtributos() {
		
		System.out.println("Marca:" +marca);
		System.out.println("Modelo:" +modelo);
		System.out.println("Processador:" +processador);
		System.out.println("Núcleos:" +nucleos);
		System.out.println("Resolução:" +resolucao);
		System.out.println("RAM:" +ram);
		System.out.println("Armazenamento" +armazenamento);
		System.out.println("Cor:" +cor);
		
	}
	
	public static void main(String[] args) {
		
	SmartPhone cel = new SmartPhone();
	cel.mostrarAtributos();
	}

}
 