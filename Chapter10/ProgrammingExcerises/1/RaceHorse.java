import java.util.Scanner;

public class RaceHorse extends DemoHorses {
	Scanner scanner = new Scanner(System.in);
	private Double vessel;
	public void setraces(){
		
		System.out.println("how many races has your horse done?");
		Double vessel = scanner.nextDouble();

	}
	
	public Double getraces() {
		return vessel;
	}
	
	

	
	
	}


