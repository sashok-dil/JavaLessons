//отобразить четные числа массива
package Lesson2;

public class Even {

	public static void main(String[] args) {
		int arr[] = { 52, 56, 11, 24, 23, 13, 16 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2==0){
			System.out.println(arr[i]);
			}
		}
	}
}