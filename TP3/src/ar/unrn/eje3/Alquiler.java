package ar.unrn.eje3;

import java.util.Objects;

public class Alquiler implements Gasto {
	private int monto;
	private String nombre;

	public Alquiler(int monto, String nombre) {
		this.monto = Objects.requireNonNull(monto);
		this.nombre = Objects.requireNonNull(nombre);
	}

	@Override
	public String marcaGasto() {
		return "";
	}

	@Override
	public int calcularGasto(int gastoTotalDeComida) {
		// TODO Auto-generated method stub
		return gastoTotalDeComida;
	}

	@Override
	public int calcularGastoTotal(int gastoTotal) {
		return gastoTotal += monto;
	}

	@Override
	public Comprobante realizarComprobante() {
		return new Comprobante(nombre, monto, marcaGasto());
	};
}
