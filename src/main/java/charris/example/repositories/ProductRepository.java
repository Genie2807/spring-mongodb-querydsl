package charris.example.repositories;

import org.springframework.data.document.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import charris.example.domain.Product;

public interface ProductRepository extends MongoRepository<Product, String>, QueryDslPredicateExecutor<Product> {

}
