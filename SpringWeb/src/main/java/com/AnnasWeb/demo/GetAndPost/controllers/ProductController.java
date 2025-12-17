package com.AnnasWeb.demo.GetAndPost.controllers;

import com.AnnasWeb.demo.GetAndPost.models.Product;
import com.AnnasWeb.demo.GetAndPost.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }


    @GetMapping("/products")
    public String productHome(Model page){
        var productList = productService.findAll();
        page.addAttribute("products", productList);

        return "products.html";
    }
    @PostMapping("/products")
    public String addProduct(Product p,
                             Model page){
        productService.addProduct(p);

        page.addAttribute("products", productService.findAll());
        return "products.html";
    }
}
