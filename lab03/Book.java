package lab03;

public class Book {
	private String name;
	private Author author;
	private double price;
	private int qtyInStock = 0;
	
	public Book (String name, Author author, double price){
		this.name = name;
		this.author = author;
		this.price = price;
	}
	
	public Book (String name, Author author, double price, int qtyInStock){
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}
	
	public String getName(){
		return this.name;
	}
	
	public Author getAuthor(){
		return this.author;
	}
	
	public double getPrice(){
		return this.price;
	}
	
	public String getAuthorName(){
		return this.author.getName();
	}
	
	public String getAuthorEmail(){
		return this.author.getEmail();
	}
	
	public char getAuthorGender(){
		return this.author.getGender();
	}
	
	public int qtyInStock(){
		return this.qtyInStock;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public void setQtyInStock(int qtyInStock){
		this.qtyInStock = qtyInStock;
	}
	
	public String toString(){
		return name + " by " + author.getName() + " (" + author.getGender() + ") at " + author.getEmail();
	}
}