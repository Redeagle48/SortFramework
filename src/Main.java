import quicksort.*;
import mergesort.*;

public class Main {
	public static void main (String[] args) {
		
		int[] test = new int[]{2,1,3,7,2,4};
		
		Quicksort quicksort = new Quicksort();
		Mergesort mergesort = new Mergesort();
		
		int[] resultado = mergesort.sort(test);//quicksort.sort(test);
		
		for(int i = 0; i < resultado.length; i++) {
			System.out.println(resultado[i]);
		}
	}
}
