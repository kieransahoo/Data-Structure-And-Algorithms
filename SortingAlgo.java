import java.util.*;

public class SortingAlgo {
    
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n-1 ; i++)
        {
            for(int j = 0 ; j < n-i-1 ;j++){
                if (arr[j] > arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n-1 ; i++)
        {
            for(int j = i+1 ; j < n ;j++){
                if (arr[j] < arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static void insertionSort(int[] arr){
        
        for(int i = 1 ; i<arr.length;i++){
            int key = arr[i];
            int j = i - 1;
            while(j>=0 && key < arr[j] ){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    public static void mergeSort(int[] arr){
        if(arr.length<=1){
            return;
        }

        int mid = arr.length/2;
        int[] left = new int[mid];
        int[] right = new int[arr.length-mid];

        for(int i = 0; i<mid ;i++)
        {
            left[i] = arr[i];
        }

        for(int i = mid; i<arr.length ;i++)
        {
            right[i-mid] = arr[i];
        }

        mergeSort(left);
        mergeSort(right);

        merge(left,right,arr);

    }

    public static void merge(int[] left, int[] right , int[] arr){
        int i = 0,j=0, k=0;

        while(i <left.length && j <right.length ){
            if(left[i]<right[j]){
                arr[k]=left[i];
                i++;
            }else{
                arr[k]=right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }

        
        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }

    }

    public static void main(String[] args) {
        
        int[] arr1 = { 5, 4, 10, 2, 30, 45, 34, 14, 18, 9};
        //selectionSort(arr1);
        //bubbleSort(arr1);
        //mergeSort(arr1);
        insertionSort(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}