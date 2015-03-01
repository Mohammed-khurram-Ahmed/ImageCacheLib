package com.example.testalhamudlillah;

public class ItemDetails {

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getImageNumber() {
		return imageUrl;
	}

	public void setImageNumber(String imageNumber) {
		this.imageUrl = imageNumber;
	}

	private String name;
	private String itemDescription;
	private String price;
	private String imageUrl;

}
