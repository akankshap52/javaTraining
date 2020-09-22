package assignment1;

public class ExceptionHandling {

	public static void main(String[] args) {
	    // TODO Auto-generated method stub
        int a=20,b=0,c;
        try {
        	c=a/b;
            String str ="Hello";
            System.out.println("The result is : "+str.charAt(10));
          
            
        }
        catch(ArithmeticException e) {
            System.out.println("Inside the arthmetic exception catach block");
        }
        catch(ArrayIndexOutOfBoundsException np) {
            System.out.println("Inside the array index out of bounds exception");
        }
        finally {
            System.out.println("Inside the finally block");
        }
        System.out.println("After the finally block...");
	}

}
