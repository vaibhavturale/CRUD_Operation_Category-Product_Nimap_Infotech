package org.nimapinfotech.repository;

import org.nimapinfotech.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
