/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa;

import java.util.Scanner;

public class RotatedArrayInplace
{
   static public int[] rotatedArr(int[] arr,int k){
    int n= arr.length;
    k = k%n;
    reverse(arr, 0, n-k-1);
    reverse(arr, n-k, n-1);
    reverse(arr, 0, n-1);
    return arr;
    
  }
   static public void reverse(int[] arr,int i, int j ){
     
    while(i < j){
     swap(arr,i,j);
     i++;
     j--;
     
   }
    
  }
   public static void swap(int[] arr, int i, int j){
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
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
