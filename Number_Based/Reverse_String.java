package Number_Based;


class Reverse_String { //use same to check if string palindrome or not i.e return r.equals(s); see below...
 public static void main(String[] args) {
   
     String s = "sagginkcuf"; 
   
     
     String r = "";
     char ch;

     for (int i = 0; i < s.length(); i++) {
           
           // extracts each character
         ch = s.charAt(i);
       
           // adds each character in
         // front of the existing string
         r = ch + r; 
     }
   
     System.out.println(r);
 }
}
/*Approach 2
//Java program to Reverse String STRING PALINDROME****
//Using StringBuilder
import java.io.*;
class Main {

 public static void main(String[] args) {
   
     String s = "racecar";

      
     StringBuilder res = new StringBuilder();

     
     	res.append(s); 
      	res.reverse();
      	String res1=res.toString();
     	if(s.equals(res1)){
     			// print reversed String
     	System.out.println(true);
 } 
 		else {System.out.println(false);}
}}-----------Approach 3-----------
// Java program to Reverse a String by
// Converting string to characters one
// by one
import java.io.*;

class Main {
  
    public static void main(String[] args) {
      
        String s = "Geeks";

        // Using toCharArray to copy elements
        char[] arr = s.toCharArray();

        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i]);
    }
}
------------STRING PALINDROME-----------
String s="madam";
  StringBuilder sb=new StringBuilder(s).reverse();  // String sb=new StringBuilder(s).reverse().toString();  
     sb.toString();
     
     if(s.equals(sb)) System.out.println(true);
     else System.out.println(false);
*/