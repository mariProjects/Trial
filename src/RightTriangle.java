import java.util.Scanner;
public class RightTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	double a, b, c;
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Finding the hypotenuse of a right triangle\n");
	System.out.println("Enter a: ");
	a = scan.nextInt();
	System.out.println("Enter b: ");
	b = scan.nextInt();
	
	c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
	
	System.out.println("The hypotenuse is " + c);
	}

}
