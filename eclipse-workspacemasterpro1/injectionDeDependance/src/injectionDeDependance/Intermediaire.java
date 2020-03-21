package injectionDeDependance;

public class Intermediaire {
	private Coach c;

	/*public Coach getC() {
		return c;
	}*/

	public void setC(Coach c) {
		this.c = c;
	}
	
	public void affiche()
	{
		System.out.println(c.getCoach());
	}
	

}
