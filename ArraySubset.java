package Hashing;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Goutam on 12/16/2017.
 */
public class ArraySubset {
    private static boolean isSubset(int[] a, int m, int[] b, int n){
        /*HashSet<Integer> hS = new HashSet<>();
        for(int i=0; i<m; i++)
            hS.add(a[i]);
        
        for(int i=0; i<n; i++){
            if(!hS.contains(b[i])){
                return false;
            }
        }*/

        HashMap<Integer, Integer> hM = new HashMap<>();
        for(int i=0; i<m; i++){
            if(hM.get(a[i]) == null){
                hM.put(a[i], 1);
            }else{
                int count = hM.get(a[i]);
                hM.put(a[i], count+1);
            }
        }
        
        for(int i=0; i<n; i++){
            if(hM.get(b[i])== null)
                return false;
            else{
                int count = hM.get(b[i]);
                if(count == 1)
                    hM.remove(b[i]);
                else
                    hM.put(b[i], count-1);
            }
        }
        
        return true;
    }
    
    public static void main(String args[]){
        int[] a = {1, 1, 13, 21, 3, 7};
        int len1 = a.length;
        int[] b = {1, 3, 7, 1, 1};
        int len2 = b.length;
        System.out.println("is b[] is sub set of a[] : " + isSubset(a, len1, b, len2));
    }
}
