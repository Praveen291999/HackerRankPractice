package hackerRank.paypal;

import java.util.ArrayList;

/*
 Write a Java Program such that if the Stock level is greater than 2* salesVelocity 
 Example: 50>=2*20
 */

import java.util.List;
import java.util.stream.Stream;

class Product {
	private String productId;
	private int salesVelocity;
	private int stockLevel;

	public Product(String productId, int salesVelocity, int stockLevel) {

		this.productId = productId;
		this.salesVelocity = salesVelocity;
		this.stockLevel = stockLevel;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public int getSalesVelocity() {
		return salesVelocity;
	}

	public void setSalesVelocity(int salesVelocity) {
		this.salesVelocity = salesVelocity;
	}

	public int getStockLevel() {
		return stockLevel;
	}

	public void setStockLevel(int stockLevel) {
		this.stockLevel = stockLevel;
	}

}

class Solution {

	public static List<String> inventoryClearance(List<Product> products) {
		List<String> product=new ArrayList<>();
		
		products.forEach(prod->{
			
			if(prod.getStockLevel()>= 10*prod.getSalesVelocity()) {
				product.add(prod.getProductId());
			}
			
		});
		return product;

	}
}

public class InventoryClearanceSale {

	public static void main(String[] args) {

		List<Product> products = Stream
				.of(new Product("Coke", 2, 25), new Product("Pepsi", 1, 20), new Product("Sprite", 4, 30)).toList();

		List<String> productName = Solution.inventoryClearance(products);
		System.out.println(productName);

	}

}
