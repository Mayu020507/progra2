package Cuentas;

public class CuentaBancaria {

	static String nombreBanco;
	static int totalCuentasCreadas=0;
	private double numeroCuenta;
	private String titular;
	private double saldo=0;

	public CuentaBancaria(double numeroCuenta, String titular, double saldo){
		this.numeroCuenta=numeroCuenta;
		this.titular=titular;
		totalCuentasCreadas=totalCuentasCreadas+1;	
		if (saldo>=0) {
			this.saldo=saldo;
		}else {
			System.out.println("Saldo Invalido");
		}
		System.out.println("Cuenta creada exitosa, su saldo es= " + this.saldo);
	}
		public void depositar(double monto) {
			double bonificacion=0.15;
			if (monto>=200 ) {
				saldo=saldo+(saldo*bonificacion);
			}else {
					saldo=saldo+monto;
			}
		}
		
		public boolean retirar(double monto) {
			double comision=0.35;	
			boolean retiro=true;
			monto=+comision;
			if (monto>=saldo) {
				return retiro;
			}else {
				return retiro=false;
			}
		}
		
		public static int getTotalCuentas() {
			return (totalCuentasCreadas);
		}
		
		public double getNumeroCuenta() {
			return numeroCuenta;
		}
		public String getTitular() {
			return titular;
		}
		public void setTitular(String titular) {
			if (titular.equals(null)) {
				System.out.println("El nombre del titular esta vacío");
			}else {
				this.titular=titular;
			}
		}
		public double getSaldo() {
			return saldo;
		}
		public void setSaldo(double saldo) {
			if (saldo>=0) {
				this.saldo=saldo;
			}else {
				System.out.println("Saldo invalido");
			}
		}
		
}
