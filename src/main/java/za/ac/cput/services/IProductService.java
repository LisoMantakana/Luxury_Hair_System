package za.ac.cput.services;

import za.ac.cput.domain.Product;

import java.util.List;
import java.util.Set;

public interface IProductService extends IService<Product, String> {

    List<Product> getall();
}
