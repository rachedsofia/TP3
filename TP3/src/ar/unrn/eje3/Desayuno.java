package ar.unrn.eje3;

public class Desayuno extends Comida {

	public Desayuno(int monto, String nombre) {
		super(monto, nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String marcaGasto() {
		if (this.ObternerMonto() > 1000)
			return "X";
		return "";
	}

}
