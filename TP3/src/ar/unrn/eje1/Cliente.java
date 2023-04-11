package ar.unrn.eje1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cliente {
	private List<Alquiler> alquileres;
	private String nombreCliente;

	public Cliente(String nombre) {
		this.nombreCliente = Objects.requireNonNull(nombre);
		this.alquileres = new ArrayList<Alquiler>();
	}

	public Comprobante calcularDeudaYPuntosObtenidos() {
		Integer puntosAlquilerFrecuente = 0;
		Double monto = 0.0;

		for (Alquiler alquiler : alquileres) {
			monto = alquiler.calcularMonto(monto);
			puntosAlquilerFrecuente = alquiler.sumarPuntos(puntosAlquilerFrecuente);
		}
		return new Comprobante(monto, puntosAlquilerFrecuente);
	}

	public void alquilar(Alquiler rental) {
		alquileres.add(rental);
	}

}