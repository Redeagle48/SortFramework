package sortalgorithms.insertionsortgeneric;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import sortalgorithms.SortAlgorithm;

public class InsertionSortGeneric extends SortAlgorithm {

	private Object[] objectsToSort;
	private int number;

	public Object[] run(Object[] values){
		this.objectsToSort = values;
		number = objectsToSort.length;

		try {
			insertionsort();

		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return objectsToSort;
	}

	public void insertionsort() throws NoSuchMethodException, SecurityException{
		int count = 1; //To pass the first while

		while (count != 0){
			count = 0;
			for (int i = 0; i < number-1; i++) {

				Class c = objectsToSort[i].getClass();
				Class[] cArg = new Class[1];
				cArg[0] = objectsToSort[i].getClass();
				Method lmethod = c.getDeclaredMethod("compareTo", cArg);

				Object[] vect = {objectsToSort[i+1]};

				try {
					if((int)lmethod.invoke(objectsToSort[i], vect) > 0) {
						exchangeObj(i, i+1);
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
				}
			}
		}
	}

	public void exchangeObj(int i, int j){
		Object t=objectsToSort[i];
		objectsToSort[i]=objectsToSort[j];
		objectsToSort[j]=t; 
	}


}
