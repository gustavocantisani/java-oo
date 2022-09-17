package bytebank;

public class TestaCliente {
	
	public static void main(String[] args) {
		
		Conta contaDoGustavo = new Conta(13, 440);
		Cliente gustavo = new Cliente();
		contaDoGustavo.setTitular(gustavo);
		
		gustavo.setNome("Gustavo Cantisani");
		gustavo.setCpf("111.000.788-00");
		gustavo.setProfissao("Product Manager");
		
		System.out.println("O nome do titular da conta e " + gustavo.getNome());
		System.out.println("O CPF do titular da conta e "+ gustavo.getCpf());
		System.out.println("A profissao do titular da conta e " + gustavo.getProfissao());
		
		Conta contaDaKarina = new Conta(13, 540);
		Cliente karina = new Cliente();
		contaDaKarina.setTitular(karina);
		
		karina.setNome("Karina Pessanha");
		karina.setCpf("000.000.111-00");
		karina.setProfissao("Bibliotecaria");
		
		System.out.println("O nome do titular da conta e " + karina.getNome());
		System.out.println("O CPF do titular da conta e "+ karina.getCpf());
		System.out.println("A profissao do titular da conta e " + karina.getProfissao());
		
	}
}
