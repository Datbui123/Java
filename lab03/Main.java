package lab03;

public class Main {

	public static void main(String[] args) {
		Author A = new Author("buitiendat", "buitiendat@gmail.com", 'f');
		System.out.println(A);
		A.setEmail("12345@gmail.com");
		System.out.println(A);
		Book newBook = new Book("1", A, 10.00, 1000);
		System.out.println(newBook);
		
		System.out.println("Ten tac gia: " + newBook.getAuthorName());
		System.out.println("Gioi tinh tac gia: " + newBook.getAuthorGender());
		System.out.println("Email tac gia: " + newBook.getAuthorEmail());
	}

}