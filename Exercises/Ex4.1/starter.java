import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your favorite pasta? Fettucini or Pesto?");
		String a = sc.nextLine();
	
		if(a.equals("Fettucini")){System.out.println("You win!");}
		else if(a.equals("Pesto")){System.out.println("You Lose!");}
		
		System.out.println("What is your favorite pizza? Pepperoni or Cheese?");
		String b = sc.nextLine();
		
		if(b.equals("Pepperoni")){System.out.println("You win!");}
		else if(b.equals("Cheese")){System.out.println("You Lose!");}
		
		System.out.println("What is your favorite korean food? Kimbap or Bulgogi?");
		String c = sc.nextLine();
		
		if(c.equals("Bulgogi")){System.out.println("You win!");}
		else if(c.equals("Kimbap")){System.out.println("You Lose!");}
		
		System.out.print("What is your favorite mexican food? Tacos or Burritos");
		String d = sc.nextLine();
		
		if(d.equals("Burritos")){System.out.println("You win!");}
		else if(d.equals("Tacos")){System.out.println("You lose!");}
		
		
		
		
		
	}
}
