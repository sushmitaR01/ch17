package com.xworkz.enumprograms;

public class CustemerDTO {
	private String name;
	private String email;
	private ProductType producttype;
	
	private CustemerDTO() {
		System.out.println("Running a no arg cons in a  CustemerDTO.. ");
		}

	public CustemerDTO(String name, String email, ProductType producttype) {
		super();
		this.name = name;
		this.email = email;
		this.producttype = producttype;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public ProductType getProducttype() {
		return producttype;
	}

	 public void printDetails() {
	        System.out.println("Customer Name: " + name);
	        System.out.println("Customer Email: " + email);
	        System.out.println("Product Type: " + producttype);
	

}
}
