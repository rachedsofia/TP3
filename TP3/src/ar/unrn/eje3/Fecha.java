package ar.unrn.eje3;
public class ImplementacionProvedorDeFecha implements ProvedorDeFecha {

	@Override
	public LocalDate devolverFecha() {

		return LocalDate.now();
	}
}
