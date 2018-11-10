package edu.mum.cs.cs425.progmgmt.service;

import java.util.List;
import java.util.Optional;

import edu.mum.cs.cs425.progmgmt.model.Product;




public interface IProductService {
	 List<Product> findAll();
	 Product save(Product student);
	 Product findOne(Long id);
	 void delete(Long id);
}
