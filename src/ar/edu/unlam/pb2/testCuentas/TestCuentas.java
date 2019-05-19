package ar.edu.unlam.pb2.testCuentas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cuentas.CajaDeAhorro;
import cuentas.Cuenta;
import cuentas.CuentaCorriente;
import cuentas.CuentaSueldo;

class TestCuentas {

	@Test
	public void cuentaSueldo() {
		Cuenta cuenta1 = new CuentaSueldo();
		cuenta1.depositar(1000.0);
		cuenta1.depositar(1000.0);
		cuenta1.depositar(1000.0);
		Double valorEsperado1 = 3000.0;
		assertEquals(valorEsperado1, cuenta1.getSaldo());
		cuenta1.extraer(2000.0);
		Double valorEsperado2 = 1000.0;
		assertEquals(valorEsperado2, cuenta1.getSaldo());
		}

	
	
	class TestParaSaberSiSeDescuentaElPorcentajeLuegoDeLaQuintaExtraccion {
	@Test
	public void cajaDeAhorro() {

		Cuenta cuenta2 = new CajaDeAhorro();

		cuenta2.depositar(1000.0);
		Double valorEsperado1 = 1000.0;
		assertEquals(valorEsperado1, cuenta2.getSaldo());

		cuenta2.extraer(50.0);
		cuenta2.extraer(50.0);
		cuenta2.extraer(50.0);
		cuenta2.extraer(50.0);
		cuenta2.extraer(50.0);

		Double valorEsperado2 = 744.0;
		assertEquals(valorEsperado2, cuenta2.getSaldo());
	}
	}
	
	

	class TestParaSaberSiSeCalculaBienElPorcentajeAdicionalSobreElDescubierto {
	@Test
	public void cuentaCorreinte() {

		Cuenta cuenta3 = new CuentaCorriente();

		cuenta3.depositar(1000.0);
		Double valorEsperado1 = 1000.0;
		assertEquals(valorEsperado1, cuenta3.getSaldo());

		cuenta3.extraer(1500.0);
		Double valorEsperado2 = -525.0;
		assertEquals(valorEsperado2, cuenta3.getSaldo());

	}
	}
}
