package poo;

public class TestaConta {

	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		c1.numero = 8927;
		c1.limite = 500.0D;
		c1.saldo = 2000.0D;
		
		System.out.println(c1.numero);
		System.out.println(c1.limite);
		System.out.println(c1.saldo);
		
		Conta c2 = new Conta(2000, 3000.0D);
		
		System.out.println(c2.toString());
		
		c1.deposita(2000.0D);
		
		System.out.println("C1 - Saldo: "+c1.getSaldo());
		
		c2.deposita(5000.0D);
		
		System.out.println("C2 - Saldo: "+c2.getSaldo());
		
		c1.exibeSaldo();
	}

}
