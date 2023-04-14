package ar.unrn.eje3;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Reporte {
	private int gastoComida;
	private int total;
	LocalDate fecha;
	private List<Comprobante> listComprobante;

	Reporte(int gasto, int total, LocalDate fecha, List<Comprobante> listComprobante) {
		this.gastoComida = Objects.requireNonNull(gasto);
		this.total = Objects.requireNonNull(total);
		this.fecha = Objects.requireNonNull(fecha);
		this.listComprobante = Objects.requireNonNull(listComprobante);
	}

	int obtenerGasto() {
		return gastoComida;
	}

	int obtenerTotal() {
		return total;
	}

	Comprobante obtenerComprobante(int indice) {
		return listComprobante.get(indice);
	}

	void agregarComprobante(Comprobante comprobante) {
		this.listComprobante.add(comprobante);
	}

	LocalDate obtenerFecha() {
		return fecha;
	}
}
