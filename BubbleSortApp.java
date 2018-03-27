import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortApp {
    public static  void main (String args[]){

        Scanner scan = new Scanner(System.in);
        int arr[] = new int[5];

        for(int i = 0;i<arr.length;i++){
            System.out.println("Enter a number at position "+ i +" to be sorted: ");
            arr[i] = scan.nextInt();
        }

        BubbleSort bubleSort = new BubbleSort(arr);
        bubleSort.sort();

        int sortedArr[] = new int[5];

        sortedArr = bubleSort.getArr();

        System.out.println(Arrays.toString(sortedArr));

    }
}
