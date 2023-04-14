package ar.unrn.eje3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class ReporteDeGastoTest {
	@Test
	public void reporteDeGastosGenerico() {

		List<Gasto> misGastos = new ArrayList<Gasto>();

		Gasto alquiler = new Alquiler(40, "Alquiler de Auto");
		Gasto cena = new Cena(5100, "Cena");
		Gasto desayuno = new Desayuno(5, "Desayuno");

		misGastos.add(cena);
		misGastos.add(alquiler);
		misGastos.add(desayuno);

		ReporteDeGastos reporteGastos = new ReporteDeGastos(new ArrayList<Comprobante>(), LocalDate.now());

		Reporte reporte = reporteGastos.imprimir(misGastos);

		Comprobante comprobanteCena = reporte.obtenerComprobante(0);
		Comprobante comprobanteAlquiler = reporte.obtenerComprobante(1);
		Comprobante comprobanteDesayuno = reporte.obtenerComprobante(2);

		Assert.assertEquals("X", comprobanteCena.obtenerMarca());
		Assert.assertEquals("", comprobanteAlquiler.obtenerMarca());
		Assert.assertEquals("", comprobanteDesayuno.obtenerMarca());

		Assert.assertEquals(LocalDate.now(), reporte.obtenerFecha());

		Assert.assertEquals(5145, (int) reporte.obtenerGasto());
		Assert.assertEquals(5105, (int) reporte.obtenerTotal());
	}

}
