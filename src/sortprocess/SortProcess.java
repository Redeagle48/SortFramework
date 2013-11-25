package sortprocess;

import sortalgorithms.SortAlgorithm;

public class SortProcess {
	
	SortAlgorithm sortalg;
	
	public void init(SortAlgorithm sortalg) {
		this.sortalg = sortalg;
	}
	
	public int[] run(int[] values) {
		return sortalg.run(values);
	}

}
