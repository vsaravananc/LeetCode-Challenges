import java.util.Arrays;

public class BoatToSavePeopel {
    public static void main(String[] args) {
        int[] nums={3,2,2,1}; int L=3;

        System.out.println(res(nums, L));
    }

    public static int res(int[] nums , int L){

        Arrays.sort(nums);
        int boats = 0;

        int i=0 , j=nums.length-1 ;

        while(i < j){

            if(nums[i] + nums[j] <= L){
                boats ++ ;
                i++;
                j--;
            }else{
                boats++;
                
                j--;
            }


        }

        if(i == j){
            boats++;
        }

        return boats;


    }
}
