package ar.unrn.eje1;

public class Main {
	public static void main(String args[]) {
		Libro elTunel = new LibroRegular("El T�nel", 1);
		Libro antesDelFin = new LibroInfantil("Antes del Fin", 2);

		Libro elTunelCopia = elTunel;
		Libro antesDelFinCopia = antesDelFin;

		Alquiler alquilerElTunel = new Alquiler(elTunelCopia, 5);
		Alquiler alquilerAntesDelFin = new Alquiler(antesDelFinCopia, 3);
		Cliente cliente1 = new Cliente("Sof�a");

		cliente1.alquilar(alquilerElTunel);
		cliente1.alquilar(alquilerAntesDelFin);
	}
}