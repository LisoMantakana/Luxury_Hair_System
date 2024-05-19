package za.ac.cput.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Product;
import za.ac.cput.factory.CustomerFactory;
import za.ac.cput.factory.ProductFactory;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductServiceTest {

    @Autowired
    private ProductService productService;

    Product product;

    @BeforeEach
    void setUp() {

         product = ProductFactory.buildProduct("A6477", "Virgin", "Kinky curls",
                 "30 inches, 4x4 lace", "Ginger", true, 7000.00);
         assertNotNull(product);
        System.out.println(product);
    }


    @Test
    void create() {
        Product product1 = productService.create(product);
        assertNotNull(product1);
        System.out.println(product1);
    }

    @Test
    void read() {
        Product read = productService.read(product.getProductId());
        assertNotNull(read);
        System.out.println(read);
    }

    @Test
    void update() {
        Product updateProduct = new Product.Builder().copy(product).setProductId("B8855").build();
        Product updated = productService.update(updateProduct);
        assertNotNull(updated);
        System.out.println(updated);
    }

    @Test
    void getall() {
        System.out.println(productService.getall());

    }
}