package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {
    public static void main(String[] args) {
        //case 1:
        int[] case1 = new int[]{2, 7, 11 ,15};
        output(twoSum(case1, 9));
        //case 2:
        int[] case2 = new int[]{3, 2, 4};
        output(twoSum(case2, 6));
    }
    public static int[] twoSum(int[] numbers, int target){
        List<Integer> list = new ArrayList<>();
        int[] ans = new int[2];
        int n = numbers.length;
        for(int i = 0; i < n; i++){
            if(list.contains(numbers[i])){
                ans[1] = i;
                ans[0] = list.indexOf(numbers[i]);
            }
            list.add(target - numbers[i]);
        }
        return ans;
    }
    public static void output(int[] arr){
        System.out.println("[" + arr[0] + ", " + arr[1] + "]");
    }
}
