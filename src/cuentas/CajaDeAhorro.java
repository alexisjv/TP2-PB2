package cuentas;

public class CajaDeAhorro extends Cuenta {
	
int contador = 0;
	
	@Override
	
	public Double extraer(Double cantidad) {
		final int EXTRA = 6;
		
		if(cantidad < saldo) {
			saldo = saldo - cantidad;
			this.contador = contador +1;
		}
		if(contador >=5) {
			saldo = saldo - EXTRA;
		}
		
		return saldo;
	}
}
