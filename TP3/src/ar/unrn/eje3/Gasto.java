package ar.unrn.eje3;

public interface Gasto {
	public int calcularGasto(int gastoTotalDeComida);

	public int calcularGastoTotal(int gastoTotal);

	public String marcaGasto();

	public Comprobante realizarComprobante();

}
