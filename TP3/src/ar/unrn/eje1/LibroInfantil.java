package ar.unrn.eje1;

public class LibroInfantil extends Libro {
	public LibroInfantil(String nombre, int codigoPrecio) {
		super(nombre, codigoPrecio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double calcularMonto(int diasAlquilados, Double monto) {
		monto += 1.5;
		if (diasAlquilados > 3)
			monto += (diasAlquilados - 3) * 1.5;
		return monto;
	}

}
