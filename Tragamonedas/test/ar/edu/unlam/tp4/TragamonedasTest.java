package ar.edu.unlam.tp4;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TragamonedasTest {

	@Test
	public void testQueLosTamboresSeInicienCorrectamente() {
		
		Tragamonedas miTragamonedas = new Tragamonedas ();		
		Integer valoresperado = 1 ;
				
		assertEquals(valoresperado, miTragamonedas.miTambor1.getPosicion(), 0.01);
		assertEquals(valoresperado, miTragamonedas.miTambor2.getPosicion(), 0.01);
		assertEquals(valoresperado, miTragamonedas.miTambor3.getPosicion(), 0.01);
	}
	
	
	@Test
	public void queElNumeroGeneradoEsteEntreUnoyDiez(){
		
		RandoNumberGenerator valortambor = new RandoNumberGenerator();		
		Integer valorgenerado = valortambor.generate();
		
		Assert.assertTrue((valorgenerado >= 1) && (valorgenerado <= 10));
	}
	
	
	@Test
	public void queSeEntreguePremioAlObtenerTresValoresIguales(){
		
		Tragamonedas miTragamonedas = new Tragamonedas ();
		miTragamonedas.activar();
		miTragamonedas.miTambor1=miTragamonedas.miTambor2=miTragamonedas.miTambor3;
		
		Assert.assertTrue(miTragamonedas.entregaPremio());		
	}
	
	@Test
	public void queNoSeEntreguePremioAlObtenerValoresDistintos(){
		
		Tragamonedas miTragamonedas = new Tragamonedas ();				
		miTragamonedas.miTambor1.setNumero(1);
		miTragamonedas.miTambor2.setNumero(2);
		miTragamonedas.miTambor3.setNumero(3);
		
		Assert.assertFalse(miTragamonedas.entregaPremio());		
	}	
}