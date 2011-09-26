package charris.example.domain;

import com.mysema.query.annotations.QueryEntity;

@QueryEntity
public class Product {
	
	private String sku;

	public Product() {}

	public Product(String sku) {
		this.sku = sku;
	}
	
	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}
}
