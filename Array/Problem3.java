import java.util.*;


public class Problem3 {
    public static int getLargest(int[] arr){
        int largestNo=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largestNo){
                largestNo=arr[i];
            }
        }
        return largestNo;
    }
    public static void main(String args[]){
        // array creation 
        int[] arr={5,-4,-6,-1,0,-50};
        int result=getLargest(arr);

        System.out.println("The largest no in the given array is:"+result);
    }
}
