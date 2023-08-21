package Generics;

public class GenericMethodExcerciser {

	public GenericMethodExcerciser() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		Integer[] arr1 = {1,2,3,4,5};
		Double[] arr2 = {1.0,3.1,5.2,7.2,8.2};
		String[] arr3 = {"A", "B", "C", "D"};
		GenericMethod.printArray(arr1);
		GenericMethod.printArray(arr2);
		GenericMethod.printArray(arr3);
	}
}
