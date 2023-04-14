package ar.unrn.eje3;

import java.util.Objects;

public class Comida implements Gasto {
	private int monto;
	private String nombre;

	public Comida(int monto, String nombre) {
		this.monto = Objects.requireNonNull(monto);
		this.nombre = Objects.requireNonNull(nombre);
	}

	@Override
	public int calcularGasto(int gastoTotalDeComida) {

		return gastoTotalDeComida += monto;
	}

	@Override
	public String marcaGasto() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public int calcularGastoTotal(int gastoTotal) {

		return gastoTotal += monto;
	}

	protected int ObternerMonto() {
		return this.monto;
	}

	@Override
	public Comprobante realizarComprobante() {
		return new Comprobante(nombre, monto, marcaGasto());
	}
}