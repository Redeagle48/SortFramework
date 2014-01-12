package sortutils;

public class Utils {
	
	// Exchange two elements in an vector of Objects
	public static void exchangeObj(int i, int j, Object[] objectsToSort){
		Object t=objectsToSort[i];
		objectsToSort[i]=objectsToSort[j];
		objectsToSort[j]=t; 
	}
	
}
