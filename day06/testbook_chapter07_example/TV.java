package testbook_chapter07_example;

public class TV extends Controller {

	String name = "TV";
	
	public TV(boolean power) {
		super(power);
	}
	
	public void show() {
		System.out.print(name);
		super.show();
	}
	
	public String getName() {
		return name;
	}
}
