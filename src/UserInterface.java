import java.util.Scanner;
public class UserInterface {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is your name? ");
		String name = scan.nextLine();
		System.out.println("How old are you? ");
		int age = scan.nextInt();
		scan.nextLine();
		System.out.println("Where do you live? ");
		String country = scan.nextLine();
		
		System.out.println("Your name is " + name + "\nYou are " + age + " years old." + "\nYou are from the " + country);

	}

}
