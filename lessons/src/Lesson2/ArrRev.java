//отобразить значения массива arr в обратном порядке
package Lesson2;

public class ArrRev {

	public static void main(String[] args) {
		int arr[]={ 52, 56, 11, 24, 23, 13, 16 };
		for (int i = arr.length-1; i < arr.length;i--) {
			System.out.println(arr[i]);	
			if (i==0) break;
		}
	}
}