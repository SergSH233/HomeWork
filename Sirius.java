package universe;

public class Sirius extends Star{
	public Sirius(String galaxy) {
		super(galaxy);
		// TODO Auto-generated constructor stub
	}
	public String color;
	public int radius;
	public double mas;
	public String name;
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
