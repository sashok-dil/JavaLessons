package Lesson2;

import sun.reflect.generics.tree.ReturnType;

public class Grater {
//��������� � ������� ��� ����� ������ 50
	
	/*public static void main(String[] args) {
		int arr[]={42, 54, 77, 11, 34, 21, 56, 78, 90, 10, 13, 29};
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>50){
			System.out.println(arr[i]);
			}
			
		}
}
}*/
//������� � ������� ������ ������ ������� �������
	
	/*public static void main(String[] args){
		int arrNew[]={42, 54, 77, 11, 34, 21, 56, 78, 90, 10, 13, 29, 67 };
		for (int i = 0; i < arrNew.length; i++) {
			if(i%3==2){
			System.out.println(arrNew[i]);
			}
		}
		//��� ������ ������ �����
		 for (int i = 0; i < arrNew.length; i+=3) {
			System.out.println(arrNew[i]);
			}
		}
		
	
}*/

	
//��������� ������� ������ �� ��� �������, � ������ ������� �������� ������� ���������, 
	//�� ������ �������������� ����� � ������������� (���� 29 ����� -29*/
		public static void main(String[] args){
			int arrOld[]={42,54,77,11,34,21,56,78,90,10,13,29,64 };
			int first[] = new int[arrOld.length/2];
			int second[] = new int[arrOld.length-first.length];
			
										
				for (int i = 0; i < arrOld.length; i++) {
					if(i<first.length){
						first[i] = arrOld[i];
						System.out.println("������ ������ "+first[i]);
					} else {
						second[i-first.length] = arrOld[i];
						System.out.println("������ ������ "+second[i-first.length]);
						
					}
					
					
				}
				
					
				
				
		}

}
				
			
			







