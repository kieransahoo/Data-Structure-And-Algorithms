package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayPermutation {
    static void solve(int[] nums, boolean[] flag, List<Integer> arr, List<List<Integer>> res){
        if(arr.size() == nums.length){
            res.add(new ArrayList<>(arr));
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(!flag[i]){
                flag[i]=true;
                arr.add(nums[i]);
                solve(nums, flag, arr, res);
                arr.remove(arr.size()-1);
                flag[i]=false;
            }
        }
    }

    public static List<List<Integer>> permute(int[] nums) {
        boolean[] flag=new boolean[nums.length];
        List<List<Integer>> res=new ArrayList<>();
        solve(nums, flag, new ArrayList<Integer>(), res);
        return res;
    }

    public static void main(String[] args){
        int[] num = {1,2,3};
        System.out.println(permute(num));
    }
}
