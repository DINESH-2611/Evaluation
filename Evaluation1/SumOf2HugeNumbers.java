package Evaluation1;

import java.util.Scanner;

public class SumOf2HugeNumbers {
    static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the no of digits of 1st number");
        int n1=scanner.nextInt();
        System.out.println("Enter the no of digits of 2nd number");
        int n2=scanner.nextInt();
        int size=0;
        int[] arr1=new int[n1];
        int[] arr2=new int[n1];
        if(n1>n2)
            size=n1;
        else
            size=n2;
       int[] res= new SumOf2HugeNumbers().sum(arr1,arr2,size);
       boolean zero=false;
       for (int i:res){
           if(i!=0){
               zero=true;
           }
           if(zero)
               System.out.print(i+" ");
       }

    }
    int[] sum(int[] arr1,int[] arr2,int size){
        int[] res=new int[size+2];
        int carry=0,i=arr1.length-1,j=arr2.length-1,index=res.length-1;
        while(i>=0 || j>=0 || carry!=0){
            int sum=0;
            if(i>=0){
                sum+=arr1[i--];
            }if(j>=0){
                sum+=arr2[j--];
            }
            sum+=carry;
            carry=sum/10;
            res[index--]=sum%10;
        }
        return res;

    }
}
