package ar.unrn.eje1;

import java.util.Objects;

public class Alquiler {
	private int diasAlquilados;
	private Libro copiaLibro;

	public Alquiler(Libro copia, Integer diasAlquilados) {
		this.copiaLibro = Objects.requireNonNull(copia);
		this.diasAlquilados = Objects.requireNonNull(diasAlquilados);
	}

	public Double calcularMonto(Double monto) {
		return copiaLibro.calcularMonto(diasAlquilados, monto);
	}

	public Integer sumarPuntos(Integer puntosAlquilerFrecuente) {
		return copiaLibro.sumarPuntos(diasAlquilados, puntosAlquilerFrecuente);
	}
}
