package wik.shop.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import wik.shop.Models.Product;

@Repository
public
interface ProductRepository extends JpaRepository<Product,Integer> {

}
