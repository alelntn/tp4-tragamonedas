package ar.edu.unlam.tp4;

public class FixNumberGenerator implements NumberGenerator {
	
	private Integer numero;

	// Este generador devolverá siempre number cuando se llame al método generate()	 
	public FixNumberGenerator (Integer number) {
		this.numero = number;
	}
	
	
	// post: devuelve el número de posición en la que se encuentra el Tambor. 
	// Es un valor comprendido entre 1 y 10.	
	@Override
	public Integer generate() {
		return this.numero;
	}
}