package bytebank;

public class TestaCliente {
	
	public static void main(String[] args) {
		
		Conta contaDoGustavo = new Conta();
		contaDoGustavo.titular = new Cliente();
		
		contaDoGustavo.titular.nome = "Gustavo Cantisani";
		contaDoGustavo.titular.cpf = "111.000.788-00";
		contaDoGustavo.titular.profissao = "Product Manager";
		
		System.out.println("O nome do titular da conta e " + contaDoGustavo.titular.nome);
		System.out.println("O CPF do titular da conta e "+ contaDoGustavo.titular.cpf);
		System.out.println("A profissao do titular da conta e " + contaDoGustavo.titular.profissao);
		
		Conta contaDaKarina = new Conta();
		contaDaKarina.titular = new Cliente();
		
		contaDaKarina.titular.nome = "Karina Pessanha";
		contaDaKarina.titular.cpf = "000.000.111-00";
		contaDaKarina.titular.profissao = "Bibliotecaria";
		
		System.out.println("O nome do titular da conta e " + contaDaKarina.titular.nome);
		System.out.println("O CPF do titular da conta e "+ contaDaKarina.titular.cpf);
		System.out.println("A profissao do titular da conta e " + contaDaKarina.titular.profissao);
		
	}
}
