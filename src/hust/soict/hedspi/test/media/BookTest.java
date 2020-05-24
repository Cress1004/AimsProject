package hust.soict.hedspi.test.media;

import hust.soict.hedspi.aims.media.Book;

public class BookTest {
		public static void main(String[] args) {
			Book book = new Book("con co be be", "Xuan Mai");
			book.setContent("Xuan Mai Xinh gai xinh dep ahihi");
			book.processContent();
			System.out.println(book.stringTo());
		}
}
