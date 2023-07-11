package ArrayManipulation;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = generateDistinctRandomArray(10);
        print(array);
        int[] array2 = bubbleSort(array);
        print(array2);
    }

    public static void print(int[] args){

        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }
        System.out.println();
    }

    public static int[] generateDistinctRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        
        for (int i = 0; i < size; i++) {
            int randomNumber = random.nextInt(size) + 1;

            while (contains(array, randomNumber)) {
                randomNumber = random.nextInt(size) + 1;
            }
            
            array[i] = randomNumber;
        }
        
        return array;
    }

    public static boolean contains(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return true;
            }
        }
        return false;
    }

    
    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;

        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                else{
                    continue;
                }
            }
        }
        return arr;
    }
}