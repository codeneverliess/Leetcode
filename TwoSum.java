// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    
    public static int[] twoSumBruteForce(int[] nums,int target){
        //Brute force
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]== target-nums[i]){
                    return new int[] {i,j};
                }
            }
        }
        return  new int[] {};
    }
    
    public static int[] twoSumTwoPass(int[] nums, int target){
        Map<Integer, Integer> store = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            store.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            if(store.containsKey(target-nums[i])){
                return new int[] {i,store.get(target-nums[i])};
            }
        }
    return new int[] {};
    
    }
    
    public static int[] twoSumSinglePass(int[] nums, int target){
        Map<Integer,Integer> store = new HashMap<>();
        for(int i=0; i<nums.length;i++){
            if(store.containsKey(target-nums[i])){
                return new int[] {store.get(target-nums[i]),i};
            }
            store.put(nums[i],i);
        }
        return new int[] {};
    }
    
    
    
    public static void main(String[] args) {
        System.out.println("Two Sum");
        
        int[] n = twoSumBruteForce(new int[] {4,-2,5,6,0,3,2,7},5);
        
        for(int i=0;i<n.length;i++){
            System.out.println(n[i]);
        }
        
        int[] m = twoSumTwoPass(new int[] {4,-2,5,6,0,3,2,7},5);
        
        for(int i=0;i<m.length;i++){
            System.out.println(m[i]);
        }
        
        int[] z = twoSumSinglePass(new int[] {4,-2,5,6,0,3,2,7},5);
        
        for(int i=0;i<z.length;i++){
            System.out.println(z[i]);
        }
    }
}
