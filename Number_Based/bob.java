package Number_Based;

import java.util.Scanner;
public class bob {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int [] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
            
        }
        int mid=n/2;
        if(n%2==1) 
         {System.out.println(arr[mid]);
         }
                else{
                    int avg=(arr[mid-1]+arr[mid])/2;
                     System.out.println(avg);
    }
        s.close();
                }
        
  
    }
