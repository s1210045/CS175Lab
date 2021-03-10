
public class RoachPopulation {
	
	private double Roachpopulation;
	

	public RoachPopulation(int number) {
		Roachpopulation = number;
	}

	
	
	public void breed() {
		
		Roachpopulation = Roachpopulation * 2;
	}

	 
	public void spray(double sprayPct) {
		
     Roachpopulation = (Roachpopulation - ( Roachpopulation * sprayPct));
		
		
	}

	public double getRoaches() {
		
	
		return Roachpopulation;
	}
	
	
}