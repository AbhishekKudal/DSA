// Use for when given range from 1 to N

import java.util.Arrays;

public class CyclicSort {
 public static void main(String[] args) {
    int arr[] = new int[]{3,2,5,4,1};
    sort(arr);
    System.out.println(Arrays.toString(arr));
    
 }  
 static void sort(int arr[]){
    int i =0;
    while(i<arr.length){
        int correct = arr[i]-1;             // index = value-1
        if(arr[i]!=arr[correct]){           //check if arr[i] == arr[corect] if equal then don't swap increase i else swap number 
            swap(arr,i,correct);
        }
        else{
            i++;
        }
    }
 }
 
 static void swap(int arr[],int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
 }
}
