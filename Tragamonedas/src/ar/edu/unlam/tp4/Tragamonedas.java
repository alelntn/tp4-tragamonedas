package ar.edu.unlam.tp4;

public class Tragamonedas {
		
	protected Tambor miTambor1;
	protected Tambor miTambor2;
	protected Tambor miTambor3;
	private FixNumberGenerator numero = new FixNumberGenerator(1); 
	
	
	// post: los 3 Tambores del Tragamonedas están en la posición 1.
	public Tragamonedas() {				
		this.miTambor1 = new Tambor (numero);
		this.miTambor2 = new Tambor (numero);
		this.miTambor3 = new Tambor (numero);
	}
	
	
	// post: activa el Tragamonedas haciendo girar sus 3 Tambores.
	public void activar() {		
		this.miTambor1.girar();
		this.miTambor2.girar();
		this.miTambor3.girar();		
	}
	
	
	// post: indica si el Tragamonedas entrega un premio a partir de la posición de sus 3 Tambores.
	public Boolean entregaPremio() {		
		if(this.miTambor1.getPosicion() == this.miTambor2.getPosicion() && this.miTambor2.getPosicion() == this.miTambor3.getPosicion()){
			return true;
		}
		else {
			return false;
		}
	}	
}