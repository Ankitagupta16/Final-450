//Sort an array of 0s, 1s and 2s

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Q4_Array {
 
 public static void main (String[] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     int t = Integer.parseInt(br.readLine().trim()); 
     while(t-->0){
         int n = Integer.parseInt(br.readLine().trim());
         int arr[] = new int[n];
         String inputLine[] = br.readLine().trim().split(" ");
         for(int i=0; i<n; i++){
             arr[i] = Integer.parseInt(inputLine[i]);
         }
         sort012(arr, n);
         StringBuffer str = new StringBuffer();
         for(int i=0; i<n; i++){
             str.append(arr[i]+" ");
         }
         System.out.println(str);
     }
 }
     public static void sort012(int a[], int n)
     {
         int z=0;
         int o=0;

     for(int i=0;i<n;i++)
     {
         if(a[i]==0) z++;
         else if(a[i]==1) o++;
         
     }
     
     for (int i = 0; i < z; i++) 
             a[i] = 0;
      
         for (int i = z; i < 
             (z + o); i++) 
             a[i] = 1;
      
         for (int i = (z + o);
             i < n; i++) 
             a[i] = 2;
     }
 }

