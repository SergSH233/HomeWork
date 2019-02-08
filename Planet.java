package universe;

public class Planet extends Star_system{

	public Planet(String galaxy) {
		super(galaxy);
		// TODO Auto-generated constructor stub
	}
	public String system = "Sun System";
	public String theForm = "Ball";
	@Override
	public void printGalaxy() {
		System.out.println("From planet");
	}
		// TODO Auto-generated method stub
	public void printSystem() {
		System.out.println("Sun System");
	}
		
	}
	
	
	
	


