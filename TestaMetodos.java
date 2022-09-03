package bytebank;

public class TestaMetodos {
	
	public static void main(String[] args) {
		Conta contaDoGustavo = new Conta();
		contaDoGustavo.saldo = 500;
		System.out.println(contaDoGustavo.saldo);
		
		Conta contaDaKarina = new Conta();
		contaDaKarina.saldo = 1000;
		System.out.println(contaDaKarina.saldo);
		
		contaDoGustavo.deposita(50);
		System.out.println(contaDoGustavo.saldo);
		
		contaDoGustavo.saca(300);
		System.out.println(contaDoGustavo.saldo);
		
		contaDaKarina.transfere(600, contaDoGustavo);
		System.out.println(contaDoGustavo.saldo);
	}
	
}
