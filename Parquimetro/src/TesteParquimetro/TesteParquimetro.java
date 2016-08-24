package TesteParquimetro;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ExeParquimetro.Parquimetro;

public class TesteParquimetro {
	
	private Parquimetro parq;
	
	@Before
	public void setUp() throws Exception{
		parq = new Parquimetro();
		parq.insereMoeda(100);
	}
	
	@Test
	public void TesteInsereMoeda() throws Exception {
		parq.insereMoeda(1);
		parq.insereMoeda(5);
		parq.insereMoeda(10);
		parq.insereMoeda(25);
		parq.insereMoeda(50);
		parq.insereMoeda(100);
		assertEquals(291, parq.getSaldo());
	}
	
	@Test
	public void TesteGetSaldo(){
		int valor = (int) parq.getSaldo();
		assertEquals(100, valor);
	}
	
	@Test
	public void TesteEmitirTicket() {
		parq.insereMoeda(50);
		parq.insereMoeda(50);
		parq.insereMoeda(100);
		boolean valor = parq.emiteTicket();
		assertEquals(true, valor);
		
	}

	private void assertEquals(boolean b, boolean valor) {
		// TODO Auto-generated method stub
		
	}
	
}
