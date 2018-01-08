package Hashing;

import java.util.HashMap;

/**
 * Created by Goutam on 12/16/2017.
 */
public class AllSumZeroArrays {
    public static int evaluteTheNo(int arr[], int arrLength ){

        HashMap<Integer, Integer> hS = new HashMap<Integer, Integer>();
        int count = 0;
        int Sum = 0;
        hS.put(0,1);

        for(int currIndex = 0 ; currIndex < arrLength ; currIndex++){
            Sum += arr[currIndex];
            
            if(hS.containsKey(Sum)) {
                count += hS.get(Sum);
                hS.put(Sum,hS.get(Sum)+1);
            }
            else
                hS.put(Sum, 1);

        }

        return count;
    }
    
    public static void main(String args[]) {
        int arr[] = {0, 0, 5, 5, 0, 0};
        int a[] = {6,  -1, -3, 4, -2, 2, 4, 6, -12, -7};
        System.out.println("No of Total Zero sum sub-array is: " + evaluteTheNo(a, a.length));
    }
}
