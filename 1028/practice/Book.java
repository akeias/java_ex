package practice;

public class Book {
	String title;
	String author;
	
	public Book(String t) {
		title = t;
		author="�۰��̻�";
	}
	public Book(String t, String a) {
		title=t;
		author=a;
	}
	public static void main(String[] args) {
		Book LittlePrince = new Book("�����","�������丮");
		Book LoveStory = new Book("������");
		System.out.println(LittlePrince.title+" "+LittlePrince.author);
		System.out.println(LoveStory.title+" "+LoveStory.author);
	}

}
