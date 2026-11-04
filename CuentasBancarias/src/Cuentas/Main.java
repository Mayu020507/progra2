package Cuentas;

public class Main {

	public static void main(String[] args) {

		CuentaBancaria a=new CuentaBancaria(02145100, "Mayuri Velez", 30);
		a.depositar(-30);
		a.retirar(40);
		System.out.println(a.getTitular());
		System.out.println(a.getNumeroCuenta());
		System.out.println(a.getSaldo());
		
		CuentaBancaria b=new CuentaBancaria(0214510000, "Anabel Velez", 30);
		b.depositar(400);
		b.retirar(100);
		System.out.println(b.getTitular());
		System.out.println(b.getNumeroCuenta());
		System.out.println(b.getSaldo());
		
		System.out.println(CuentaBancaria.getTotalCuentas());
	}

}
