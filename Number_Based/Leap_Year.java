package Number_Based;

//Logic:If the year variable is divisible by 400 or is it divisible by 4 but not 100.
public class Leap_Year
{
  public static void main (String[]args)
  {

    int year = 2020;

    if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))//REMEMBER THIS LOC
      System.out.println (year + " is a Leap Year");

    //not leap year
    else
        System.out.println (year + " is not a Leap Year");

  }
}