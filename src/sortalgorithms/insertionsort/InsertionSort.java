package sortalgorithms.insertionsort;

import sortalgorithms.SortAlgorithm;

public class InsertionSort extends SortAlgorithm{


	private int[] numbers;
	private int[] helper;
	private int offset;

	private int number;

	public int[] run(int[] values){
		offset = 0;
		this.numbers = values;
		number = numbers.length;
		this.helper = new int[number];
		insertionsort();

		numbers = helper;
		return numbers;
	}

	private void insertionsort() {

		//Insert first number in the aux vector
		helper[0] = numbers[0];

		for (int numberIndex = 1; numberIndex < numbers.length; numberIndex++) {
			for(int j = numberIndex; j >= 0; j--) {
				if(numbers[numberIndex] <= helper[numberIndex-j]) {
					offset++;
				}
			}
			insertValueVector(numbers[numberIndex], offset,numberIndex);
			offset = 0;
		}
	}

	private void insertValueVector(int value, int offset, int numberIndex){
		if(offset == 0) {
			helper[numberIndex] = value;
		} else {
			int newIndex = numberIndex-offset;
			for(int i = helper.length-2; i  >= newIndex; i--) {
				helper[i+1] = helper[i];
			}
			helper[newIndex] = value;
		}
	}


	/*
	public int[] insertValueVector(int[] numbers, int value, int offset, int numberIndex){
		int[] helper = new int[numbers.length];
		helper = numbers;
		if(offset == 0) {
			helper[numberIndex] = value;
		} else {
			int newIndex = numberIndex-offset;
			for(int i = helper.length-2; i  >= newIndex; i--) {
				helper[i+1] = helper[i];
			}
			helper[newIndex] = value;
		}

		return helper;
	}
	 */
}
