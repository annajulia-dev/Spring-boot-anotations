package com.AnnasWeb.demo.GetAndPost.services;

import com.AnnasWeb.demo.GetAndPost.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private List<Product> productList = new ArrayList<>();

    public void addProduct(Product product){
        productList.add(product);
    }

    public List<Product> findAll(){
        return productList;
    }
}
