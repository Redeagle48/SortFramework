package Tests;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import sortalgorithms.bubblesort.BubbleSort;
import sortalgorithms.heapsort.HeapSort;
import sortalgorithms.insertionsort.InsertionSort;
import sortalgorithms.insertionsortgeneric.InsertionSortGeneric;
import sortalgorithms.mergesort.Mergesort;
import sortalgorithms.quicksort.Quicksort;
import sortprocess.SortProcess;

import comparablepackage.Classe;


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
	public void testMergeSort_easy() {

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
			resultadocertoArray.add(resultadocerto[i]);
		}

		assertEquals(resultadoArray,resultadocertoArray);
	}
	
	@Test
	public void testMergeSort_normal() {

		int[] test = new int[]{4006,695,4000,700,192,100,492};
		int[] resultadocerto = new int[]{100,192,492,695,700,4000,4006};

		sortprocess.init(new Mergesort());

		int[] resultado = sortprocess.run(test);//quicksort.sort(test);

		ArrayList<Integer> resultadoArray = new ArrayList<Integer>();
		ArrayList<Integer> resultadocertoArray = new ArrayList<Integer>();

		for(int i = 0; i < resultado.length; i++) {
			resultadoArray.add(resultado[i]);
		}

		for(int i = 0; i < resultadocerto.length; i++) {
			resultadocertoArray.add(resultadocerto[i]);
		}

		assertEquals(resultadoArray,resultadocertoArray);
	}
	
	@Test
	public void testQuickSort_easy() {

		int[] test = new int[]{2,1,3,7,2,4};
		int[] resultadocerto = new int[]{1,2,2,3,4,7};

		sortprocess.init(new Quicksort());

		int[] resultado = sortprocess.run(test);//quicksort.sort(test);

		ArrayList<Integer> resultadoArray = new ArrayList<Integer>();
		ArrayList<Integer> resultadocertoArray = new ArrayList<Integer>();

		for(int i = 0; i < resultado.length; i++) {
			resultadoArray.add(resultado[i]);
		}

		for(int i = 0; i < resultadocerto.length; i++) {
			resultadocertoArray.add(resultadocerto[i]);
		}

		assertEquals(resultadoArray,resultadocertoArray);
	}
	
	@Test
	public void testQuickSort_normal() {

		int[] test = new int[]{4006,695,4000,700,192,100,492};
		int[] resultadocerto = new int[]{100,192,492,695,700,4000,4006};

		sortprocess.init(new Quicksort());

		int[] resultado = sortprocess.run(test);//quicksort.sort(test);

		ArrayList<Integer> resultadoArray = new ArrayList<Integer>();
		ArrayList<Integer> resultadocertoArray = new ArrayList<Integer>();

		for(int i = 0; i < resultado.length; i++) {
			resultadoArray.add(resultado[i]);
		}

		for(int i = 0; i < resultadocerto.length; i++) {
			resultadocertoArray.add(resultadocerto[i]);
		}
		
		assertTrue(resultadoArray.equals(resultadocertoArray));
	}
	
	@Test
	public void testInsertionSort_easy() {

		int[] test = new int[]{2,1,3,7,2,4};
		int[] resultadocerto = new int[]{1,2,2,3,4,7};

		sortprocess.init(new InsertionSort());

		int[] resultado = sortprocess.run(test);//quicksort.sort(test);

		ArrayList<Integer> resultadoArray = new ArrayList<Integer>();
		ArrayList<Integer> resultadocertoArray = new ArrayList<Integer>();

		for(int i = 0; i < resultado.length; i++) {
			resultadoArray.add(resultado[i]);
		}

		for(int i = 0; i < resultadocerto.length; i++) {
			resultadocertoArray.add(resultadocerto[i]);
		}

		assertEquals(resultadoArray,resultadocertoArray);
	}
	
	@Test
	public void testInsertionSort_normal() {

		int[] test = new int[]{4006,695,4000,700,192,100,492};
		int[] resultadocerto = new int[]{100,192,492,695,700,4000,4006};

		sortprocess.init(new InsertionSort());

		int[] resultado = sortprocess.run(test);//quicksort.sort(test);

		ArrayList<Integer> resultadoArray = new ArrayList<Integer>();
		ArrayList<Integer> resultadocertoArray = new ArrayList<Integer>();

		for(int i = 0; i < resultado.length; i++) {
			resultadoArray.add(resultado[i]);
		}

		for(int i = 0; i < resultadocerto.length; i++) {
			resultadocertoArray.add(resultadocerto[i]);
		}

		assertEquals(resultadoArray,resultadocertoArray);
	}
	
	@Test
	public void testHeapSort_easy() {

		int[] test = new int[]{2,1,3,7,2,4};
		int[] resultadocerto = new int[]{1,2,2,3,4,7};

		sortprocess.init(new HeapSort());

		int[] resultado = sortprocess.run(test);//quicksort.sort(test);

		ArrayList<Integer> resultadoArray = new ArrayList<Integer>();
		ArrayList<Integer> resultadocertoArray = new ArrayList<Integer>();

		for(int i = 0; i < resultado.length; i++) {
			resultadoArray.add(resultado[i]);
		}

		for(int i = 0; i < resultadocerto.length; i++) {
			resultadocertoArray.add(resultadocerto[i]);
		}

		assertEquals(resultadoArray,resultadocertoArray);
	}
	
	@Test
	public void testHeapSort_normal() {

		int[] test = new int[]{4006,695,4000,700,192,100,492};
		int[] resultadocerto = new int[]{100,192,492,695,700,4000,4006};

		sortprocess.init(new HeapSort());

		int[] resultado = sortprocess.run(test);//quicksort.sort(test);

		ArrayList<Integer> resultadoArray = new ArrayList<Integer>();
		ArrayList<Integer> resultadocertoArray = new ArrayList<Integer>();

		for(int i = 0; i < resultado.length; i++) {
			resultadoArray.add(resultado[i]);
		}

		for(int i = 0; i < resultadocerto.length; i++) {
			resultadocertoArray.add(resultadocerto[i]);
		}

		assertEquals(resultadoArray,resultadocertoArray);
	}
	
	@Test
	public void testBubbleSort_easy() {

		int[] test = new int[]{2,1,3,7,2,4};
		int[] resultadocerto = new int[]{1,2,2,3,4,7};

		sortprocess.init(new BubbleSort());

		int[] resultado = sortprocess.run(test);//quicksort.sort(test);

		ArrayList<Integer> resultadoArray = new ArrayList<Integer>();
		ArrayList<Integer> resultadocertoArray = new ArrayList<Integer>();

		for(int i = 0; i < resultado.length; i++) {
			resultadoArray.add(resultado[i]);
		}

		for(int i = 0; i < resultadocerto.length; i++) {
			resultadocertoArray.add(resultadocerto[i]);
		}

		assertEquals(resultadoArray,resultadocertoArray);
	}
	
	@Test
	public void testBubbleSort_normal() {

		int[] test = new int[]{4006,695,4000,700,192,100,492};
		int[] resultadocerto = new int[]{100,192,492,695,700,4000,4006};

		sortprocess.init(new BubbleSort());

		int[] resultado = sortprocess.run(test);//quicksort.sort(test);

		ArrayList<Integer> resultadoArray = new ArrayList<Integer>();
		ArrayList<Integer> resultadocertoArray = new ArrayList<Integer>();

		for(int i = 0; i < resultado.length; i++) {
			resultadoArray.add(resultado[i]);
		}

		for(int i = 0; i < resultadocerto.length; i++) {
			resultadocertoArray.add(resultadocerto[i]);
		}

		assertEquals(resultadoArray,resultadocertoArray);
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

}
