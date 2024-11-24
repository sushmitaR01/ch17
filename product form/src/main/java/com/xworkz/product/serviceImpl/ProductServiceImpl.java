package com.xworkz.product.serviceImpl;

import com.xworkz.product.dto.ProductDto;
import com.xworkz.product.repository.ProductRepoImpl;
import com.xworkz.product.repository.ProductRepoService;
import com.xworkz.product.service.ProductService;

public class ProductServiceImpl implements ProductService{

	@Override
	
	public boolean isValidAndSave(ProductDto ProductDto) {
		boolean valid=true;
		
		String companyName=ProductDto.getCompanyName();
		if(companyName!=null && !companyName.isEmpty() && companyName.length()>3 && companyName.length()<30) {
			System.out.println("companyName is valid");
		}
		else {
			System.out.println("companyName is not valid");
			valid=false;
		}
		
		String productName=ProductDto.getProductName();
		if(productName!=null && !productName.isEmpty() && productName.length()>3 && companyName.length()<30) {
			System.out.println("productName is valid");
		}
		else {
			System.out.println("productName is not valid");
			valid=false;
		}
		
		int productQuantiy=ProductDto.getProductQuantity();
		if(productQuantiy>0 && productQuantiy<10) {
			System.out.println("productQuantiy is valid");
		}
		else {
			System.out.println("productQuantiy is not valid");
			valid=false;
		}
			
		double productCost=ProductDto.getProductCost();
		if(productCost>=100) {
			System.out.println("productCost is valid");
		}
		else {
			System.out.println("productCost is not valid");
			valid=false;
		}
		if(valid)
		{
			System.out.println("save date into database");
			ProductRepoService repository = new ProductRepoImpl();
			int pk=repository.save(ProductDto);
			if(pk>0)
			{
				System.out.println("data saved into database");
				valid=true;
			}
			else {
				System.out.println("data not saved into database");
				valid=false;
			}
		}
			return valid;
		}

		
		}
		
	


	


