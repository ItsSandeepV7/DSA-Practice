import java.util.Arrays;
import java.util.Scanner;
public class Array1 {

    public static void func(int[] arr, int size){
         int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min)
            min=arr[i];

            if(arr[i]>max)
            max=arr[i];
        }
        System.out.println("Max No:"+max+" "+"And"+" "+ "Min No:"+min);
    }
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the arr size:");
        int size= sc.nextInt();

        int[] arr= new int[size];
        //input
        System.out.print("Input Elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        func(arr,size);

       
    }
}
