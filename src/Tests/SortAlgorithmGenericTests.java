package Tests;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import sortalgorithms.bubblesortgeneric.BubbleSortGeneric;
import sortalgorithms.insertionsortgeneric.InsertionSortGeneric;
import sortprocess.SortProcess;

import comparablepackage.Classe;

public class SortAlgorithmGenericTests {
	
	static SortProcess sortprocess;

	@BeforeClass
	public static void testSetup() {
		sortprocess = new SortProcess();
	}

	@AfterClass
	public static void testCleanup() {
		// Teardown for data used by the unit tests
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
	}

	@Test
	public void testInsertionSortGeneric_normal() {

		Classe[] test = new Classe[]{new Classe("camomila", 5), new Classe("girassol", 6), new Classe("milho", 2), 
				new Classe("hamburguer", 9), new Classe("ketchup", 1)};
		
		Classe[] resultadocerto = new Classe[]{new Classe("ketchup", 1), new Classe("milho", 2), 
				new Classe("camomila", 5), new Classe("girassol", 6), 
				new Classe("hamburguer", 9)};
		
		sortprocess.init(new InsertionSortGeneric());

		Object[] resultado = sortprocess.run(test);//quicksort.sort(test);
		
		ArrayList<Classe> resultadoArray = new ArrayList<Classe>();
		
		for (Object object : resultado) {
			resultadoArray.add((Classe)object);
		}
		
		ArrayList<Classe> resultadocertoArray = new ArrayList<Classe>();

		for (Classe classeObject : resultadocertoArray) {
			resultadocertoArray.add(classeObject);
		}

		for(int i = 0; i < resultadocerto.length; i++) {
			resultadocertoArray.add(resultadocerto[i]);
		}

		assertEquals(resultadoArray,resultadocertoArray);
	}
	
	@Test
	public void testBubbleSortGeneric_normal() {

		Classe[] test = new Classe[]{new Classe("camomila", 5), new Classe("girassol", 6), new Classe("milho", 2), 
				new Classe("hamburguer", 9), new Classe("ketchup", 1)};
		
		Classe[] resultadocerto = new Classe[]{new Classe("ketchup", 1), new Classe("milho", 2), 
				new Classe("camomila", 5), new Classe("girassol", 6), 
				new Classe("hamburguer", 9)};
		
		sortprocess.init(new BubbleSortGeneric());

		Object[] resultado = sortprocess.run(test);//quicksort.sort(test);
		
		ArrayList<Classe> resultadoArray = new ArrayList<Classe>();
		
		for (Object object : resultado) {
			resultadoArray.add((Classe)object);
		}
		
		ArrayList<Classe> resultadocertoArray = new ArrayList<Classe>();

		for (Classe classeObject : resultadocertoArray) {
			resultadocertoArray.add(classeObject);
		}

		for(int i = 0; i < resultadocerto.length; i++) {
			resultadocertoArray.add(resultadocerto[i]);
		}

		assertEquals(resultadoArray,resultadocertoArray);
	}
}
