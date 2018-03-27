package com.moneyapi.resource;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.http.ResponseEntity;

import com.moneyapi.model.Category;
import com.moneyapi.repository.CategoryRepository;

@RestController
@RequestMapping("/categories")
public class CategoryResource {

	@Autowired
	private CategoryRepository categoryRepository;

	@GetMapping
	public List<Category> read() {
		return categoryRepository.findAll();
	}

	@PostMapping
	public ResponseEntity<Category> crate(@RequestBody Category category) {
		Category categorySaved = categoryRepository.save(category);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}")
				.buildAndExpand(categorySaved.getId()).toUri();
		return ResponseEntity.created(uri).body(categorySaved);
	}
	
	@GetMapping("/{id}")
	public Category findById(@PathVariable Long id){
		return categoryRepository.findOne(id);
	}

}
