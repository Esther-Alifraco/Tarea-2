package ar.edu.unlam.tallerweb.cuenta;

public class CuentaBanco {
	private double saldo=0;
	private String numeroCuenta;
	
	public CuentaBanco(String numeroCuenta){
		this.numeroCuenta= numeroCuenta;
	}
	
	public CuentaBanco(double saldo, String numeroCuenta){
		if(saldo>=0){
			this.saldo= saldo;
		}
		else{
			saldo=0;
		}
		this.numeroCuenta= numeroCuenta;
	}
	
	public void deposito(double monto){
		if(monto>0){
		this.saldo= this.saldo + monto;
		System.out.println("Su nuevo saldo es: $"+this.saldo+"--pesos");
	}
		else{
			System.err.println("por favor ingrese importe positivo");
			
		}
	}

		public void Retiro(double monto){
			if(monto<=this.saldo){
			this.saldo= this.saldo - monto;
			System.out.println("Usted ha retirado $"+monto+"--pesos. Su nuevo saldo es: $"+this.saldo+"--pesos");
			}
			else
				System.out.println("Saldo insuficiente");
		}
		
	
	public double getSaldo(){
		return saldo;
	}
}




