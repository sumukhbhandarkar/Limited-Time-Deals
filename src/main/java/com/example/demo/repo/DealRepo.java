package com.example.demo.repo;

import com.example.demo.entity.Deal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DealRepo extends CrudRepository<Deal, String> {

}
