package ar.unrn.eje1;

public class LibroRegular extends Libro {
	public LibroRegular(String nombre, int codigoPrecio) {
		super(nombre, codigoPrecio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double calcularMonto(int diasAlquilados, Double monto) {
		monto += 2;
		if (diasAlquilados > 2)
			monto += (diasAlquilados - 2) * 1.5;
		return monto;
	}
}