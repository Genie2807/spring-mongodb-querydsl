package charris.example;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import charris.example.domain.Product;
import charris.example.domain.QProduct;
import charris.example.repositories.ProductRepository;

public class MainApp {

    public static void main(String[] args) throws Exception {

        // get hold of the ProductRepository
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("springdata-context.xml");

        ProductRepository repo = context.getBean(ProductRepository.class);

        // insert a new product
        repo.save(new Product("SKU-12"));

        // query the repo
        Product p = repo.findOne(QProduct.product.sku.eq("SKU-12"));

        System.out.println("Found Product :" + p.getSku());

        // clean down
        repo.deleteAll();
    }
}
