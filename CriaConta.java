package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta(12, 230);
		primeiraConta.deposita(200);
		System.out.println(primeiraConta.getSaldo());
		
		primeiraConta.deposita(100);
		System.out.println(primeiraConta.getSaldo());
		
		Conta segundaConta = new Conta(12, 330);
		segundaConta.deposita(50);
		System.out.println(segundaConta.getSaldo());
		
		System.out.println("O saldo da primeira conta corresponde a " + primeiraConta.getSaldo());
		System.out.println("O saldo da segunda conta corresponde a " + segundaConta.getSaldo());
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
