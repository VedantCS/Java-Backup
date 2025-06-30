package Number_Based;

import java.util.Scanner;

public class ReplaceZeroWithFive {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt();  // Read input number

        int result = replaceZeroWithFive(num);
        System.out.println("Modified number: " + result);

        s.close();
    }

    public static int replaceZeroWithFive(int num) {
        if (num == 0) return 5; // Edge case: If input is 0, return 5 directly. SO 000=5 NOT 555 

        int newNum = 0, place = 1;

        while (num > 0) {
            int digit = num % 10; // Extract last digit
            if (digit == 0) digit = 5; // Replace 0 with 5

            newNum += digit * place; // Construct the new number
            place *= 10;
            num /= 10;
        }
        
        return newNum;
    }
}
/*------------------------------------------------EASY APPROACH---------------------
 * import java.util.Scanner;

public class ReplaceZeroWithFive {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = s.next();  // Read number as a string

        // Replace all '0' with '5' in the string
        String modifiedNum = num.replace('0', '5'); //SO 000 =555

        System.out.println("Modified number: " + modifiedNum);

        s.close();
    }
}
*/
