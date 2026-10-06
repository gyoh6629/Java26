package animal;

public class AnimalTest {

	public static void main(String[] args) {
//		Animal a = new Tiger();
//		printDayLife(a);
//		
//		a = new Goldfish();
//		printDayLife(a);
		
		Animal[] animals = {new Tiger(), new Goldfish(), new Tiger(), new Eagle()};
		
		for(Animal a : animals) {
			printDayLife(a);
		}
	}
	
	public static void printDayLife(Animal a) {
		System.out.println(a);
		a.eat();
		a.move();
		a.sleep();
	}
}
