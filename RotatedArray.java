/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa;

import java.util.Scanner;

public class RotatedArray
{
   static public int[] rotatedArr(int[] arr,int k){
    int n= arr.length;
    k = k%n;
    int[] ans = new int[n];
    int j=0;
    for(int i= n-k ;i<n; i++){
      ans[j++] = arr[i];
    }
    for(int i= 0 ;i<n-k; i++){
      ans[j++] = arr[i];
    }
    return ans;
    
  }
   
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter length of an Array");
    int n = sc.nextInt();
    int[] arr = new int[n];
     System.out.println("Enter elements of an Array");
    for(int i=0; i < n; i++){
      arr[i] = sc.nextInt();
    }
     System.out.println("Original Array");
     for(int i=0; i < n; i++){
     System.out.println(arr[i]);
    } 
    System.out.println("Enter value of Rotation");
    int k = sc.nextInt();
     
    int[] res= rotatedArr(arr,k);
     System.out.println("Array After Rotation");
     for(int i=0; i < n; i++){
     System.out.println(res[i]);
    } 
  }
    
 
  
}
