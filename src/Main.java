import sortalgorithms.mergesort.Mergesort;
import sortprocess.SortProcess;

public class Main {
	public static void main (String[] args) {
		
		int[] test = new int[]{2,1,3,7,2,4};
		
		SortProcess sortprocess = new SortProcess();
		
		sortprocess.init(new Mergesort());
		
		int[] resultado = sortprocess.run(test);//quicksort.sort(test);
		
		for(int i = 0; i < resultado.length; i++) {
			System.out.println(resultado[i]);
		}
	}
}
