package ar.edu.unlam.tallerweb.cuenta;

public class Cuenta {
	
	public static void main(String[] args){
		CuentaBanco c1= new CuentaBanco(0,"mar1234");
		CuentaBanco c2= new CuentaBanco(150,"est1234");
		c1.deposito(300.50);
		c2.deposito(500);
		
	    
	}

}
