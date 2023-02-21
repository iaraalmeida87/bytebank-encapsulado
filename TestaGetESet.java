public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta();
		
		//desse modo utilizamos o método set para atribuir corretamente um número ao atributo "numero"
		conta.setNumero(19008);
		
		//com o método get imprimimos o valor contido no atributo "numero"
		System.out.println(conta.getNumero());
		
		conta.setAgencia(8545);
		System.out.println(conta.getAgencia());
	}
}
