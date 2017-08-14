package com.example.mann.services;

import com.example.mann.commands.ProductForm;
import com.example.mann.domain.Product;
import java.util.List;

public interface ProductService {

    List<Product> listAll();

    Product getById(String id);

    Product saveOrUpdate(Product product);

    void delete(String id);

    Product saveOrUpdateProductForm(ProductForm productForm);
}
