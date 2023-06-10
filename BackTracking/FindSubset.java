package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class FindSubset {

    public static void  generateSubset(List<List<Integer>> list,List<Integer> temp,int[] arr, int idx){
        list.add(new ArrayList<Integer>(temp));
        for(int i = idx;i<arr.length;i++)
        {
            if(i>idx && arr[i]==arr[i-1])continue;
            temp.add(arr[i]);
            generateSubset(list,temp,arr, i+1);
            temp.remove(temp.size()-1);
        }
    }

    public static void generateSubset1(List<List<Integer>> list,List<Integer> temp,int[] arr,int idx){

        list.add(new ArrayList<>(temp));
        for(int i = 0; i<arr.length ;i++)
        {
            if(i>idx && arr[i]==arr[i-1])continue;
            temp.add(arr[i]);
            generateSubset1(list, temp, arr, i+1);
            temp.remove(temp.size()-1);
        }
    }



    public static void main(String[] args){
        int[] arr = {2,2,2};

        List<List<Integer>> list = new ArrayList<>();
        generateSubset(list,new ArrayList<Integer>(),arr, 0);
        System.out.println(list);
    }

}
