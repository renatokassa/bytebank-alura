package bytebank;

public class TestaMetodo {
	
	public static void main(String[] args) {
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		
		
		System.out.println("Saldo depois do dep�sito = " + contaDoPaulo.saldo);
		
		contaDoPaulo.saca(20);
		
		System.out.println("Saldo depois de sacar = " + contaDoPaulo.saldo);
	}

}
