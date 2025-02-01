import java.util.Scanner;

public class Horse extends DemoHorses {

	Scanner scanner = new Scanner(System.in);
	private String vessel1;
	private String vessel2;
	private String vessel3;
	
	public void setage(){
	//String vessel = " ";
		
		System.out.println("how old is your horse?");
		 vessel1 = scanner.nextLine();

	}
	
	public void setcolor() {
		System.out.println("What coat does your horse have? ");
		vessel2 = scanner.nextLine();
	}

	public void setname() {
		System.out.println("What is your horse called? ");
		 vessel3 = scanner.nextLine();
	}
	
	public String getage() {
		 return vessel1 ;
	}
	
	public String getcolor() {
		return vessel2 ;
	}
	
	public String getname() {
		return vessel3;
	}
	
}
