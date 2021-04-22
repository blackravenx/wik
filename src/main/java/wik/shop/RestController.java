package wik.shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import wik.shop.Models.Brand;
import wik.shop.Models.Product;
import wik.shop.Repositories.BrandRepository;
import wik.shop.Repositories.ProductRepository;

import java.util.Optional;

@org.springframework.web.bind.annotation.RestController
@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
@RequestMapping("/api/")
public class RestController {
    @Autowired
    ProductRepository productRepository;
    @Autowired
    BrandRepository brandRepository;

    @GetMapping("products")
    public Iterable<Product> getAllProduct(){
        return  productRepository.findAll();
    }
    @GetMapping("brands")
    public Iterable<Brand> getAllBrands(){
        return  brandRepository.findAll();
    }
    @GetMapping("product/{id}")
    public Optional<Product> getProduct(@PathVariable Integer id){
        return productRepository.findById(id);
    }
    @GetMapping("brand/{name}")
    public Optional<Brand> getBrand(@PathVariable String name){
        return brandRepository.findBrandByName(name);
    }
}
