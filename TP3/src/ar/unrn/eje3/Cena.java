package ar.unrn.eje3;

public class Cena extends Comida {

	public Cena(Integer monto, String nombre) {
		super(monto, nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String marcaGasto() {
		if (this.ObternerMonto() > 5000)
			return "X";
		return "";
	}

}
