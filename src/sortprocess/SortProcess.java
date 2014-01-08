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
	
	public Object[] run(Object[] tosort_objects) {
		return sortalg.run(tosort_objects);
	}

}
