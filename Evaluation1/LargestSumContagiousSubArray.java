package Evaluation1;

import java.util.Scanner;

public class LargestSumContagiousSubArray {
    static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        int size=scanner.nextInt();
        int[] arr=new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the elements of the array");
            arr[i]=scanner.nextInt();
        }
        new LargestSumContagiousSubArray().subArray(arr);
    }
    void subArray(int[] arr){
        int maxSum=0,currentSum=0,start=0,end=0,tempStart=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
               currentSum+=arr[i];
            }else{
                if(currentSum>maxSum){
                    maxSum=currentSum;
                    start=tempStart;
                    end=i-1;
                    currentSum=0;
                    tempStart=i+1;
                }else{
                    tempStart=i+1;
                }
            }

        }
        if(currentSum>maxSum){
            maxSum=currentSum;
            start=tempStart;
            end=arr.length-1;
        }
        System.out.println("Maximim sum= "+maxSum);
        System.out.println("Elements");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i]);
            if(i<arr.length-1){
                System.out.print(",");
            }
        }
    }
}
