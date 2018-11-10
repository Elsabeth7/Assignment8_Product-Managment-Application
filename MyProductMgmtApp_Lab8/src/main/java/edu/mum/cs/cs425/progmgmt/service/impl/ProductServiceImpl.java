package edu.mum.cs.cs425.progmgmt.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.cs.cs425.progmgmt.model.Product;
import edu.mum.cs.cs425.progmgmt.repository.IProductRepository;
import edu.mum.cs.cs425.progmgmt.service.IProductService;



@Service("productService")
public class ProductServiceImpl implements IProductService {

	@Autowired
	IProductRepository productRepository;
	
	@Override
	public List<Product> findAll() {
		return (List<Product>) productRepository.findAll();
	}

	@Override
	public Product save(Product product) {
		return productRepository.save(product);
	}

	/*@Override
	public Product findOne(Long id) {
		return productRepository.findOne(id);
	}*/

	@Override
	public void delete(Long id) {
		productRepository.deleteById(id);
	}

	@Override
	public Product findOne(Long id) {
		return productRepository.getOne(id);
	}

}
