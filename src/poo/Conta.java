package poo;

public class Conta {
	int numero;
	double limite;
	double saldo;
	
	//Método construtor Padrão
	public Conta() {
		
	}
	
	//Método construtor Alternativo
	public Conta(int numero, double saldo) {
		this.numero = numero;
		this.limite = 300.0D;
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo + limite;
	}
	
	public void exibeSaldo() {
		System.out.println("Conta: "+numero+" - Saldo: "+String.format("R$ %.2f", getSaldo()));
	}
	
	public void deposita(double valor) {
		if(valor <= 0) {
			System.out.println("Operação cancelada, valor inválido");
		}else {
		saldo += valor;
		}
	}
		
//	
//	public void saca(double valor) {
//		if(valor <= 0) {
//			System.out.println("Operação cancelada, valor inválido");
//		}else {
//		if(valor < getSaldo()) {
//			saldo -= valor;
//		}else {
//			System.out.println("Operação inválida.\nSaldo indisponível...");
//		}
//	}
//}
	
	
	
	public String toString() {
		return String.format("[numero = %d], [limite = %.2f], [saldo = %2.0f]\n\n", numero, limite, saldo);
	}
}
