package com.example.springboot;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path= "person")
public interface PersonRepository extends PagingAndSortingRepository<Person, Integer> {

}
