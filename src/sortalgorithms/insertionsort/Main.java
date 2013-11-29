package sortalgorithms.insertionsort;

public class Main {
	public static void  main(String[] args) {
		
		InsertionSort insertionSort = new InsertionSort();
		
		//int[] resultado = insertionSort.insertValueVector(new int[]{1, 2, 3, 0, 0, 0}, 7, 3, 3);
		
		//Estou a fazer isto
		int[] resultado = insertionSort.run(new int[]{2, 1, 4, 3,7,4,2,3, 5, 6});
		
		for (int i = 0; i < resultado.length; i++) {
			System.out.println(resultado[i]);
		}
	}
}
