package ar.unrn.eje3;
public class FechaFake implements ProveedorDeFecha{
	@Override 
	public LocalDate obtenerFecha() {
		return LocalDate.of(2023,04,14);
	}

}
