package sortalgorithms.bubblesort;

import sortalgorithms.SortAlgorithm;

public class BubbleSort extends SortAlgorithm {

	private int[] numbers;
	private int number;

	public int[] run(int[] values){
		this.numbers = values;
		number = numbers.length;

		bubblesort();

		//System.out.println("Estou no merge");

		return numbers;
	}

	public void bubblesort(){
		int count = 1; //To pass the first while
		
		while (count != 0){
			count = 0;
			for (int i = 0; i < number-1; i++) {
				if(numbers[i] > numbers[i+1]) {
					exchange(i, i+1);
					count++;
				}
			}
		}
	}

	public void exchange(int i, int j){
		int t=numbers[i];
		numbers[i]=numbers[j];
		numbers[j]=t; 
	}

}
