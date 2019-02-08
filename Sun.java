package universe;

public class Sun extends Star {
	
	
	public String color;
	public int radius;
	public double mas;
	public String name;
	
	public Sun (String name) {
		super(name);
		this.name = name;
		}
	public Sun (String name, String color) {
		this(name);
		this.color = color;
	}
	public Sun (String name, String color, int radius) {
		this(name, color);
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double getMas() {
		return mas;
	}
	public void setMas(double mas) {
		this.mas = mas;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
