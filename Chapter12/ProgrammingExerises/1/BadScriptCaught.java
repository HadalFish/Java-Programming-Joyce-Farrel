import java.util.Scanner;
public class BadScriptCaught {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = {"Anna" , "Basil", "Cesar" , "Dawson" , 
				"Elizabeth" , "Fredrick", "Grechen" , "Harrold" };
		
		Scanner s = new Scanner(System.in);
		
		int selection;
		
		try {
			System.out.println("please enter a whole number between 1 and 8:");
			selection = s.nextInt();
			selection = selection - 1;
			System.out.println(names[selection]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Errror: " + e.getMessage());
			System.out.println();
			System.out.println("opp you need to pick a whole number between 1 and 8");
		}
		
		
	}

}
