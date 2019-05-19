package cuentas;

public class CuentaCorriente extends Cuenta {
	
	public final Double DESCUBIERTO = 1000.0;
	public final Double PORCENTAJE = 0.05;
	
	@Override
	
	public Double extraer(Double cantidad) {
		if(cantidad < saldo) {
			saldo = saldo - cantidad;
		}
		else {
			if(cantidad <= saldo + DESCUBIERTO) {
				saldo = saldo - cantidad;
				saldo = saldo +(saldo*PORCENTAJE);
			}
			else {
				System.out.println("No posee suficiente saldo");
			}
		}
		
		return saldo;
	}
	
	

}
