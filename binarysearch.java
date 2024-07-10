package binarysearch;
import java.util.Scanner;
public class Binarysearch{
    public static void main(String[] args) {
               // TODO code application logic here
       int arr[]={2,3,4,5,6,50};
        int target=50;
        int ans=binary(arr,target);
        System.out.println("target is present at index:" + ans);
    }
        static int binary(int [] a, int target )
          {
         int start=0;
         int end=a.length-1;
         while(start<=end){
            int mid=(start+end)/2;
            if(target<a[mid]){
                end=mid-1;
            }
            else if(target>a[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
    }
         return -1;
}        
    } 
    

