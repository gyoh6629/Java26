package testbook_chapter07_example;

public class Radio extends Controller {

	String name = "라디오";
	
	public Radio(boolean power) {
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
