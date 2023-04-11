package ar.unrn.eje1;

import java.util.Objects;

public abstract class Libro {
	private String nombreLibro;
	private int codigoPrecio;

	protected static final int PUNTO_SUMATORIA = 1;

	public Libro(String nombre, int codigoPrecio) {
		this.nombreLibro = Objects.requireNonNull(nombre);
		this.codigoPrecio = Objects.requireNonNull(codigoPrecio);
	}

	public int codigoPrecio() {
		return codigoPrecio;
	}

	public abstract Double calcularMonto(int diasAlquilados, Double monto);

	public int sumarPuntos(int diasAlquilados, int puntosAlquilerFrecuente) {
		return PUNTO_SUMATORIA + puntosAlquilerFrecuente;
	}
}