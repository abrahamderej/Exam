package com.example.demo.service;

import com.example.demo.domain.Product;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
public class ProductService {
    // implement how to return data
    //get Data usin object mapper from JFileChooser
    //and Map to product object
    @Autowired
    ObjectMapper objectMapper;

    public List<Product> getProduct()throws IOException {
        Product  p = objectMapper.readValue(new File("data.json"), Product.class);
        return null;
    }
}
