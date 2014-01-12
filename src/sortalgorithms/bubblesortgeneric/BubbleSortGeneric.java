package sortalgorithms.bubblesortgeneric;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import sortalgorithms.SortAlgorithm;
import sortutils.Utils;

public class BubbleSortGeneric extends SortAlgorithm{

	private Object[] objectsToSort;
	private int number;

	public Object[] run(Object[] values){
		this.objectsToSort = values;
		number = objectsToSort.length;

		bubblesort();

		return objectsToSort;
	}

	public void bubblesort(){
		int count = 1; //To pass the first while

		while (count != 0){
			count = 0;
			for (int i = 0; i < number-1; i++) {

				Class<? extends Object> c = objectsToSort[i].getClass();
				Class[] cArg = new Class[1];
				cArg[0] = objectsToSort[i].getClass();
				Method lmethod;
				try {
					lmethod = c.getDeclaredMethod("compareTo", cArg);


					Object[] vect = {objectsToSort[i+1]};

					if((int)lmethod.invoke(objectsToSort[i], vect) > 0) {
						Utils.exchangeObj(i, i+1, objectsToSort);
						count++;
					}
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NoSuchMethodException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SecurityException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
