public class BinarySearch {

    public static int binarySearch(int[] arr,int findNo){
        int start=0;
        int end=arr.length-1;
        int mid = start+(end-start)/2;

       while(start<=end){
         mid = start+(end-start)/2;

        if(arr[mid]==findNo){
            return 1;
        }
        else if(arr[mid]>findNo){
            end=mid-1;
        }
        else{
            start=mid+1;
        }
       }
       return 0;
    }
    public static void main(String args[]){
        //given array
        int[] arr={1,2,4,5};
        int findNo=5;
        int result=binarySearch(arr, findNo);
        System.out.println(result);
    }
}
