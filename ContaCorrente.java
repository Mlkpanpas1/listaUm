public class ContaCorrente {
	private int numeroConta;
	private double saldo;
		
	public ContaCorrente(int novoNumeroConta,double novoSaldo ) {
		    this.numeroConta = novoNumeroConta;
		    this.saldo = novoSaldo;
		       
	}
	
		public int getNumeroConta() {
			return numeroConta;
			
	}
		public double getSaldo() {
			return saldo;
		}
		
	  public void setSaldo(double novoSaldo) {
		  this.saldo = novoSaldo;
		  
	  }
	  
	  public void sacar(double valor) {
		  this.saldo= saldo - valor;
	  }
	  public void depositar(double valor) {
		  this.saldo= saldo + valor;
	  }
	  public String toString () {
		  return "Número da conta:" + this.numeroConta + "\n saldo: R$ " + this.saldo; 
	  }
}
