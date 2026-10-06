package testbook_chapter07_example;


// Comparable<T>, compareTo(T o), compare(T, o) 다 안배움, Array.sort()이것도 안배웠고 이거만으론 정렬도 안됨
public class Book implements Comparable<Book>{

	int price;
	
	Book(int price){
		this.price = price;
	}
	
	@Override
	public int compareTo(Book o) {
		return Integer.compare(this.price, o.price);
	}

	@Override
	public String toString() {
		return "Book [price=" + price + "]";
	}
	
}
