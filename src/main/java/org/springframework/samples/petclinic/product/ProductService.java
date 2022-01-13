package org.springframework.samples.petclinic.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService {

    private ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Transactional(readOnly = true)
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Transactional(readOnly = true)
    public List<ProductType> getAllProductTypes() {
        return productRepository.findAllProductTypes();
    }


    @Transactional(readOnly = true)
    public List<Product> getProductsCheaperThan(double price) {
        return this.productRepository.findByPriceLessThan(price);
    }

    @Transactional(readOnly = true)
    public ProductType getProductType(String typeName) {
        return productRepository.findProductTypeByProductTypeName(typeName);
    }

    @Transactional
    public Product save(Product p) {
        return productRepository.save(p);
    }


}
