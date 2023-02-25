public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(6149, 12345);
		
		//desse modo utilizamos o método set para atribuir corretamente um número ao atributo "numero"
		conta.setNumero(19008);
		
		//com o método get imprimimos o valor contido no atributo "numero"
		System.out.println(conta.getNumero());
		
		conta.setAgencia(8545);
		System.out.println(conta.getAgencia());
		
		Cliente paulo = new Cliente();
		
		paulo.setNome("Paulo Silveira");
		System.out.println(paulo.getNome());
		
		paulo.setCpf("111.222.333-44");
		System.out.println(paulo.getCpf());
		
		paulo.setProfissao("programador");
		System.out.println(paulo.getProfissao());
	}
}
