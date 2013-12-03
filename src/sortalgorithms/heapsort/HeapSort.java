package sortalgorithms.heapsort;

import sortalgorithms.SortAlgorithm;

public class HeapSort extends SortAlgorithm{

	private int[] numbers;

	private int number;
	private int size;
    private int random;
    
    private int n;
    private int left;
    private int right;
    private int largest;

	public int[] run(int[] values){
		this.numbers = values;
		number = numbers.length;
		
		heapsort();

		//System.out.println("Estou no merge");

		return numbers;
	}

	public void heapsort(){

		buildheap();

		for(int i=n;i>0;i--){
			exchange(0, i);
			n=n-1;
			maxheap(0);
		}
	}

	public void buildheap(){
		n=numbers.length-1;
		for(int i=n/2;i>=0;i--){
			maxheap(i);
		}
	}

	public void maxheap(int i){ 
		left=2*i;
		right=2*i+1;
		if(left <= n && numbers[left] > numbers[i]){
			largest=left;
		}
		else{
			largest=i;
		}

		if(right <= n && numbers[right] > numbers[largest]){
			largest=right;
		}
		if(largest!=i){
			exchange(i,largest);
			maxheap(largest);
		}
	}

	public void exchange(int i, int j){
		int t=numbers[i];
		numbers[i]=numbers[j];
		numbers[j]=t; 
	}

}
