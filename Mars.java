package universe;

public class Mars extends Planet{
	public String name;
	public String landscape;
	public int piople;
	
	
	public Mars (String name) {
		super(name);
		this.name = name;
	}
	public Mars (String name, String landscape) {
		this(name);
		this.landscape = landscape;
	}
	public Mars (String name, String landscape, int piople) {
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
		
	}
	
