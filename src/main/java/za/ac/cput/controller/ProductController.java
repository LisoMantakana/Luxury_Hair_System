package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Product;
import za.ac.cput.services.ProductService;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/create")
    public Product create(@RequestBody Product product){
       return productService.create(product);
    }

    @GetMapping("/read/{productId}")
    private Product read(@PathVariable String productId){
        return productService.read(productId);
    }

    @PostMapping("/update")
    private Product update(@RequestBody Product product){
        return productService.update(product);
    }

    @GetMapping("/getall")
    private List<Product>getall(){
        return productService.getall();
    }
}
