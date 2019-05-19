package cuentas;

public class Cuenta {
	
	protected Double saldo = 0.0;
	protected Long cbu;
	
	
	public Double depositar(Double cantidad) {
		if(cantidad > 0) {
			saldo = saldo + cantidad;
		}
			return saldo;
		}
	
	public Double extraer(Double cantidad) {
		if(cantidad < saldo) {
			saldo = saldo - cantidad;
		}
		else {
			System.out.println("No posee descubierto");
		}
		return saldo;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	
	public Long getCbu() {
		return cbu;
	}
	
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public void setCbu(Long cbu) {
		this.cbu = cbu;
	}

}
