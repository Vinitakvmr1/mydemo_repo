package com.tcs.productservice.service;
import java.util.List;
import com.tcs.productservice.entity.Product;


public interface ProductService {
	public List<Product> getProducts();
	public Product getProduct(int id);
	public void addProduct(Product product);
	public void editProduct(int id, Product product);
	public void deleteProduct(int id);
	

}
