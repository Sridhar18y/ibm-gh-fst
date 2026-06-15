package fst;

public class Activity5 {
	public static void main(String[] args) {
		
		String title = "Shingeki no Kyojin";
		
		Book book = new MyBook();
		
		book.setTitle(title);

		
		System.out.println("The title is: " + book.getTitle());
	}
}

abstract class Book {
	String title;

	abstract void setTitle(String title);
	
	String getTitle() {
		return title;
	}
}

class MyBook extends Book {

	public void setTitle(String title) {
		this.title = title;
	}
	
}