package Arrays;

import java.util.Scanner;

public class MaxEle {

	public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter Size:");
        int n=obj.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++) {
        	arr[i]=obj.nextInt();
        }
        //Largest element
        int max=0;
        for(int i=0;i<n;i++) {
        	if(arr[i]>max) {
        		max=arr[i];
        	}
        }
        System.out.print("Largest element is:"+max);
	}

}
