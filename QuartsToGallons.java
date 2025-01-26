import java.util.Scanner;
public class QuartsToGallons {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		double vessel;
		double chalice = 25;
		double workaround = 1;
		
		try {
			System.out.println("How many quarts would you like converted to gallons: ");
			vessel = s.nextDouble();
			System.out.println(vessel * .25 + " gallons are equal to " + vessel + " quarts");
			chalice = vessel * 0;
		
		}
		
		catch(Exception e) {

				while(chalice != 0 ) {
					System.out.println("please enter a number: ");
					vessel = s.nextDouble();
					chalice = vessel * 0;
					workaround = vessel;
					s.next();
					
							
				}

			
				System.out.println(workaround * .25 + " gallons are equal to " + workaround + " quarts");
			
			}
		
		}
	}

			
		
			
			
			
		
		
	


