package bytebank;

public class TestaMetodos {
	
	public static void main(String[] args) {
		Conta contaDoGustavo = new Conta(13,400);
		contaDoGustavo.deposita(500);
		System.out.println(contaDoGustavo.getSaldo());
		
		Conta contaDaKarina = new Conta(13, 500);
		contaDaKarina.deposita(1000);
		System.out.println(contaDaKarina.getSaldo());
		
		contaDoGustavo.deposita(50);
		System.out.println(contaDoGustavo.getSaldo());
		
		contaDoGustavo.saca(300);
		System.out.println(contaDoGustavo.getSaldo());
		
		contaDaKarina.transfere(600, contaDoGustavo);
		System.out.println(contaDoGustavo.getSaldo());
		
		System.out.println(Conta.getTotal());
	}
	
}
