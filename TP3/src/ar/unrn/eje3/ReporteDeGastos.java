package ar.unrn.eje3;

import java.time.LocalDate;
import java.util.List;

public class ReporteDeGastos {
	int total;
	int gastosDeComida;
	private List<Comprobante> listaComprobante;
	LocalDate fecha;

	ReporteDeGastos(List<Comprobante> listaComprobante,LocalDate fecha) {
		this.listaComprobante = listaComprobante;
		this.total = 0;
		this.gastosDeComida = 0;
		this.fecha = fecha; 
	}

	Reporte imprimir(List<Gasto> gastos) {

		for (Gasto gasto : gastos) {
			gastosDeComida = gasto.calcularGasto(gastosDeComida);
			total = gasto.calcularGastoTotal(total);

			listaComprobante.add(gasto.realizarComprobante());
		}

		return new Reporte(total, gastosDeComida,, listaComprobante);
	}
}
