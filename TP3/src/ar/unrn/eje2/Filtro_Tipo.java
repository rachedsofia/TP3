package ar.unrn.eje2;

import java.util.Objects;

public enum Filtro_Tipo {
	COMPANIA("company_name", 1), CIUDAD("city", 4), ESTADO("state", 5), ENTORNO("round", 9);

	public String nombre;
	public Integer valor;

	Filtro_Tipo(String nombre, int valor) {
		this.nombre = Objects.requireNonNull(nombre);
		this.valor = Objects.requireNonNull(valor);
	}

	public int obtenerValor() {
		return this.valor;
	}

	public String obtenerNombre() {
		return this.nombre;
	}

}
