package Lesson2;

public class Primer3 {

    public static void main(String[] args) {
        int first[] = {1,4,5,7,8};
        int second[] = {0,2,3,6,9};
        int result[] = new int[first.length + second.length]; 
        int i = 0; // это будет индекс для подмассива first 
        int j = 0; // это будет индекс для подмассива second       
        
            for (int k = 0; k < result.length; k++) {
        
            if (i >= first.length) {
                 for (; j < second.length; j++,k++) {
                     result[k] = second[j]; 
                }
                break;
            }
            if (j >= second.length) {
                for (; i < first.length; i++,k++) {
                     result[k]=first[i];
                }
                break;
            }
            if (first[i] < second[j]) {
                result[k] = first[i];
                i = i+1;
            } else {
                result[k] = second[j];
                j = j+1;
            }
        }
        
        // проверка
        for (int g : result) {
            System.out.print(g);
        }
        
    }
}
     

    


