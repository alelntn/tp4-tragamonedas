package ar.edu.unlam.tp4;

public class Tambor {
	
	private Integer numero;

	public Tambor(NumberGenerator generator) {
		this.numero = generator.generate();
	}	
	
	// post: devuelve el número de posición en la que se encuentra el Tambor. 
	// Es un valor comprendido entre 1 y 10.	
	public Integer getPosicion() { 
		return this.numero;
	}
	
	
	// post: hace girar el tambor y luego se detiene en una posición comprendida entre 1 y 10.	
	public void girar() {
		RandoNumberGenerator numero = new RandoNumberGenerator();
		this.numero = numero.generate();		
	}

	public void setNumero(Integer numero) {	
		if(numero >= 1 && numero <= 10){
		this.numero = numero;
		}
	}		
}