package com.example.demo.controller;


import com.example.demo.domain.Product;
import com.example.demo.service.ProductService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @Autowired
    ObjectMapper objectMapper;

    @GetMapping("/list/all")
    public ResponseEntity<Product> getAllProduct(){
        Product p = null; //objectMapper.readValue(productService.getProduct());
        return new ResponseEntity<>(p, HttpStatus.OK);
    }


}
