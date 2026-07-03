import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] nums = {0,1,2}; int T = 3;

        System.out.println(res(nums, T));
    }

    public static int res(int[] nums , int T){
        int res = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));
        for(int i=0 ; i<nums.length-2 ; i++){
            int k= i+1 , j=nums.length-1;
        //    System.out.println("res :"+res +" minDiff : "+minnum);
            while(k<j){
                int sum = nums[i] + nums[k] + nums[j] ;
                
                if(Math.abs(sum-T) < Math.abs(T-res)){
                    
                    res = sum;
                }

                if(sum == T){
                   return sum;
                }
                else if(sum > T){
                    j--;
                }
                else 
                    k++;

               
               
            }

        }

        return res;
    }
}
