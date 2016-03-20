package javaClasses;

public class Product {
	private int productID;
	private int price;
	private int numAvailable;
	private String productName;
	private String picture;

	public Product() {
		this.productID = productID;
		this.price = price;
		this.numAvailable = numAvailable;
		this.productName = productName;
		this.picture = picture;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setNumAvailable(int numAvailable) {
		this.numAvailable = numAvailable;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

}
