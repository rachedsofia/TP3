package ar.unrn.eje1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class LibroTest {
	@Test
	public void calcularPuntosAlquier() {
		Libro elTunel = new LibroRegular("El Túnel", 1);
		Libro antesDelFin = new LibroRegular("Antes del Fin", 2);

		Libro elTunelCopia = elTunel;
		Libro antesDelFinCopia = antesDelFin;

		Alquiler alquilerElTunel = new Alquiler(elTunelCopia, 5);
		Alquiler alquilerAntesDelFin = new Alquiler(antesDelFinCopia, 3);

		Cliente cliente1 = new Cliente("Sofía");

		cliente1.alquilar(alquilerElTunel);
		cliente1.alquilar(alquilerAntesDelFin);

		Comprobante resultado = cliente1.calcularDeudaYPuntosObtenidos();

		assertEquals(10.0, resultado.obtenerMonto());
		assertEquals(2, resultado.obtenerPunto());

	}

}
