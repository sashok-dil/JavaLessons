package Lesson2;

import sun.reflect.generics.tree.ReturnType;

public class Grater {
//¬ывевести в консоль все числа больше 50
	
	/*public static void main(String[] args) {
		int arr[]={42, 54, 77, 11, 34, 21, 56, 78, 90, 10, 13, 29};
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>50){
			System.out.println(arr[i]);
			}
			
		}
}
}*/
//¬ывести в консоль каждый третий элемент массива
	
	/*public static void main(String[] args){
		int arrNew[]={42, 54, 77, 11, 34, 21, 56, 78, 90, 10, 13, 29, 67 };
		for (int i = 0; i < arrNew.length; i++) {
			if(i%3==2){
			System.out.println(arrNew[i]);
			}
		}
		//или другой способ цикла
		 for (int i = 0; i < arrNew.length; i+=3) {
			System.out.println(arrNew[i]);
			}
		}
		
	
}*/

	
//разделить поровну массив на два массива, в первом массиве изменить пор€док элементов, 
	//во втором конвертировать число в отрицательное (было 29 стало -29*/
		public static void main(String[] args){
			int arrOld[]={42,54,77,11,34,21,56,78,90,10,13,29,64 };
			int first[] = new int[arrOld.length/2];
			int second[] = new int[arrOld.length-first.length];
			
										
				for (int i = 0; i < arrOld.length; i++) {
					if(i<first.length){
						first[i] = arrOld[i];
						System.out.println("первый массив "+first[i]);
					} else {
						second[i-first.length] = arrOld[i];
						System.out.println("¬торой массив "+second[i-first.length]);
						
					}
					
					
				}
				
					
				
				
		}

}
				
			
			







