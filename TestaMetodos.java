package bytebank;

public class TestaMetodos {
	
	public static void main(String[] args) {
		Conta contaDoGustavo = new Conta();
		contaDoGustavo.deposita(500);
		System.out.println(contaDoGustavo.getSaldo());
		
		Conta contaDaKarina = new Conta();
		contaDaKarina.deposita(1000);
		System.out.println(contaDaKarina.getSaldo());
		
		contaDoGustavo.deposita(50);
		System.out.println(contaDoGustavo.getSaldo());
		
		contaDoGustavo.saca(300);
		System.out.println(contaDoGustavo.getSaldo());
		
		contaDaKarina.transfere(600, contaDoGustavo);
		System.out.println(contaDoGustavo.getSaldo());
	}
	
}
