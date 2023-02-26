public class Conta {
	//para que o atributo não seja acessado, lido ou atribuido diretamente usamos o private para proibir qualquer ação direta nele
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta() { 

	}
	public Conta( int agencia, int numero) { 
		Conta.total++;
        this.agencia = agencia;
        this.numero = numero;
    }
	public void deposita(double valor) { //criando método deposita
		this.saldo += valor;
	}
	public boolean saca(double valor) { 
		if(this.saldo >= valor) { 
	        this.saldo -= valor; 
	        return true;
		} else {
	    return false;
		}
	}
	public boolean transfere(double valor, Conta destino) { 
		if(this.saldo >= valor) { 
			this.saldo -= valor; 
	        destino.deposita(valor);
	        return true;
	    } else {
	    return false;
	    }
	}
	public double getSaldo() {
		return this.saldo;
	}
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int numero) {
		if (numero <= 0) {
            System.out.println("não é aceito valor <= 0");
            return;
        }
		this.numero = numero;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
            System.out.println("não é aceito valor <= 0");
            return;
        }
		this.agencia = agencia;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public Cliente getTitular() {
		return titular;
	}
}





