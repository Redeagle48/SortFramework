package Tests;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import sortalgorithms.mergesort.Mergesort;
import sortprocess.SortProcess;


public class SortAlgorithmTests {

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
	public void testMergeSort() {

		int[] test = new int[]{2,1,3,7,2,4};
		int[] resultadocerto = new int[]{1,2,2,3,4,7};

		sortprocess.init(new Mergesort());

		int[] resultado = sortprocess.run(test);//quicksort.sort(test);

		ArrayList<Integer> resultadoArray = new ArrayList<Integer>();
		ArrayList<Integer> resultadocertoArray = new ArrayList<Integer>();

		for(int i = 0; i < resultado.length; i++) {
			resultadoArray.add(resultado[i]);
		}

		for(int i = 0; i < resultadocerto.length; i++) {
			resultadocertoArray.add(resultado[i]);
		}

		assertEquals(resultadoArray,resultadocertoArray);
	}

}
