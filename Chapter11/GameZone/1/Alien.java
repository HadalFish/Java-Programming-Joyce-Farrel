
abstract class Alien {

	protected String skincolor;
	protected String headshape;
	protected String connected;
	protected Alien(String sc, String hs, String c)
	{
		skincolor = sc;
		headshape = hs;
		connected = c;
	}
	
	public String toString()
	{
		String message;
		message = "The alien has a " + skincolor + " skin color,"
				+ " with a " + headshape + " head shape, and is " + connected + " to the cosmos.";
		return message;
	}

}

