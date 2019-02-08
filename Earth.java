package universe;

public class Earth extends Planet{
	
	public String name;
	public String landscape;
	public int piople;
	//public boolean inhabited;
	
	public Earth (String name) {
		super(name);
		this.name = name;
	}
	public Earth(String name, String landscape) {
		this(name);
		this.landscape = landscape;
	}
	public Earth(String name, String landscape, int piople) {
		this (name, landscape);
		this.piople = piople;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLandscape() {
		return landscape;
	}
	public void setLandscape(String landscape) {
		this.landscape = landscape;
	}
	public int getPiople() {
		return piople;
	}
	public void setPiople(int piople) {
		this.piople = piople;
	}
		/*public void setInhabited(boolean inhabited) {
			//this.inhabited = inhabited;
		
	}
	public boolean getInhabited() {
		boolean inhabited = (piople <= 1);
		if (inhabited)
			return true;
		else  
			return false;
	}*/
	
	

}
