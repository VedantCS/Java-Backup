package hello_wrld;

public class throw_keyword {
	 public static void main(String[] args) {
	        try {
	            checkNumber(-5);  // This will throw an exception
	        } catch (Exception e) { 
	        	//e.printStackTrace();
	            System.out.println("Caught exception: " + e.getMessage());
	            //use e.printStackTrace() and toString() and see output;
	        }
	    }

	    public static void checkNumber(int number) {
	        if (number <= 0) {
	            throw new IllegalArgumentException(" number positive hona ");
	        }
	        System.out.println("Number is: " + number);
	    }
}
