package ar.unrn.eje1;

import java.util.Objects;

public class Comprobante {
	private Double monto;
	private int punto;

	public Comprobante(Double monto, int punto) {
		super();
		this.monto = Objects.requireNonNull(monto);
		this.punto = Objects.requireNonNull(punto);
	}

	Double obtenerMonto() {
		return monto;
	}

	int obtenerPunto() {
		return punto;
	}

}
