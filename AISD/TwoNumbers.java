package AISD;

import java.util.HashMap;

public class TwoNumbers {
    public static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> indexMap = new HashMap<Integer,Integer>();
        for(int i = 0; i < numbers.length; i++){
            Integer requiredNum = (Integer)(target - numbers[i]);
            if(indexMap.containsKey(requiredNum)){
                int toReturn[] = {indexMap.get(requiredNum), i};
                return toReturn;
            }
            indexMap.put(numbers[i], i);
        }
        return null;
    }
    public static void main(String args[])
    {
        int [] a = {1 , 4 , 5 , 11 , 12};
        int target = 9;
        for(int x : twoSum(a, target))
            System.out.print(x + " ");
    }
}

