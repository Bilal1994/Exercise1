import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello ASE2017 - How are you? :)");
		System.out.println("Please enter your name: ");
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		  String n = reader.nextLine();		reader.close(); 
		HelloUser hU = new HelloUser(n);
		hU.greetUser();
//this is a new commit
	}

}
