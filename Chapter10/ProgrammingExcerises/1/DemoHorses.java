
public class DemoHorses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Horse h = new Horse();
		RaceHorse rh = new RaceHorse();
		
		
		h.setage();
		h.setcolor();
		h.setname();
		rh.setraces();
		
		System.out.println(h.getname() + " is " + h.getage() + "years old, has a " + h.getcolor() + "coat color, and has partipated in " + rh.getraces() + " races");
	}

}
