package unitaire;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSomme {

	@Test
	public void test() {
		Sommable s = new Somme();
		assertTrue(s.additionne(3,2)==5);
	}

}
