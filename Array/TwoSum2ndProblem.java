import java.util.Arrays;

public class TwoSum2ndProblem {
     public static int[] twoSum(int[] numbers, int target) {
        
        int lp=0;
        int rp=numbers.length-1;
        int ans[]={-1,-1};
        

        while(lp<rp){
            //case1
            if(numbers[lp]+numbers[rp]==target){
                ans[0]=lp+1;
                ans[1]=rp+1;
                return ans;
            }

            //case2
             if(numbers[lp]+numbers[rp]<target){
                lp++;
            }

            //case3
             if(numbers[lp]+numbers[rp]>target){
                rp--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] numbers = {2,3,4}; 
        int target = 6;
        int[] result=twoSum(numbers,target);
       
        System.out.println(Arrays.toString(result));
        
    }
}
