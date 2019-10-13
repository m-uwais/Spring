package com.one;

public class Find_pair {
public static void main(String[] args) {
	int arr[]=new int[]{1,2,8,7,15,19,4}; 
	System.out.println("********************");
	boolean flag=false;
   for(int i=0;i<arr.length;i++) {
    for(int j=i+1;j<arr.length;j++) {
    for(int k=0;k<arr.length;k++) {
    	if(arr[i]+arr[j]==arr[k]) {
    	System.out.println(arr[i]+" "+arr[j]);
    	flag=true;
    	}}}	}
   if(flag=false){
		System.out.println("Not exist");
	}
   
}
}
