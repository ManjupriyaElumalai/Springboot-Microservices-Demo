package SteamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Product {

	int id;
	String name;
	float price;
	Product(int id, String name, float price){
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> plist = new ArrayList<Product>();
		plist.add(new Product(1, "dell", 25000f));
		plist.add(new Product(1, "Lenovo", 35000f));
		plist.add(new Product(1, "HP", 15000f));
		plist.add(new Product(1, "Apple", 22000f));

		//Method 1
//		List<Float> floatList = new ArrayList<Float>();
//		for(Product product:plist) {
//			if(product.price < 25000) {
//				floatList.add(product.price);
//							}
//		}
//		System.out.println("result"+ floatList);
		
		//Method2 filter - filtering data, map - fetching price, collect - collecting as list
		List<Float> floatList = plist.stream().filter(p -> p.price > 22000).
				map(p -> p.price).collect(Collectors.toList());		
		System.out.println("result"+ floatList);
		
		
		// Method 3 using foreach
		plist.stream().filter(product -> product.price == 22000).
		forEach(product -> System.out.println(product.name));

	}

}
