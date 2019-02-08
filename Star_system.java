package universe;

public abstract class Star_system {
	public String galaxy = "Milky Way";
	
	
	public  Star_system (String galaxy) {
		System.out.println(galaxy);
	
	}
	public abstract void printGalaxy(); 
	
}
