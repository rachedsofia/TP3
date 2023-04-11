package ar.unrn.eje1;

public class LibroNuevo extends Libro {
	public LibroNuevo(String nombre, int codigoPrecio) {
		super(nombre, codigoPrecio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double calcularMonto(int diasAlquilados, Double monto) {
		return monto += diasAlquilados * 3;
	}

	@Override
	public int sumarPuntos(int diasAlquilados, int puntosAlquilerFrecuente) {
		if (diasAlquilados > 1)
			return 2 * PUNTO_SUMATORIA + puntosAlquilerFrecuente;

		return PUNTO_SUMATORIA + puntosAlquilerFrecuente;
	}
}
