package sortalgorithms.insertionsortgeneric;

import comparablepackage.Classe;

public class Main {
	public static void  main(String[] args) {
		
		InsertionSortGeneric testSort = new InsertionSortGeneric();
		
		//int[] resultado = insertionSort.insertValueVector(new int[]{1, 2, 3, 0, 0, 0}, 7, 3, 3);
		
		Classe c1 = new Classe("tomates", 5);
		Classe c2 = new Classe("bananas", 4);
		Classe c3 = new Classe("maca", 3);
		Classe c4 = new Classe("trigo", 6);
		Classe c5 = new Classe("cenoura", 1);
		
		//Estou a fazer isto
		Object[] vect = {c1,c2,c3,c4,c5};
		Object[] resultado = testSort.run(vect);
		
		for (int i = 0; i < resultado.length; i++) {
			System.out.println(((Classe)resultado[i]).getName());
		}
	}
}
