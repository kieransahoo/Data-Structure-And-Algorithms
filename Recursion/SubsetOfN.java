package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class SubsetOfN {
    public static void findSubset(int n , ArrayList<Integer> subset){
        if(n==0){
            printSubset(subset);
            return;
        }


        // if add
        subset.add(n);
        findSubset(n-1,subset);

        // if not
        subset.remove(subset.size()-1);
        findSubset(n-1,subset);
    }

    private static void printSubset(ArrayList<Integer> subset) {
        for(int i = 0; i<subset.size();i++)
        {
            System.out.print(subset.get(i)+" ");

        }
        System.out.println();
    }

    public static void main(String[] args){
        int n = 3;
//        ArrayList<Integer> subset = new ArrayList<>();
        int[] arr = new int[n];
        for(int i = 0 ; i<n ;i++)
        {
            arr[i]=i+1;
        }
        System.out.println(Arrays.toString(arr));
        List<List<Integer>> list = new ArrayList<>();
        generateSubset(list,new ArrayList<Integer>(),arr,0);

        for(List<List<Integer>> e : list) 
        {
            if(e.size()==2){
                    System.out.println(e);
            }
        }

        System.out.println(list);
//        findSubset(n,subset);
    }

    private static void generateSubset(List<List<Integer>> list, List<Integer> temp, int[] arr, int idx) {
        list.add(new ArrayList<Integer>(temp));
        for(int i = idx;i< arr.length;i++)
        {
            if(i>idx && arr[i]==arr[i-1])continue;
            temp.add(arr[i]);
            generateSubset(list,temp,arr,i+1);
            temp.remove(temp.size()-1);
        }
    }


}
