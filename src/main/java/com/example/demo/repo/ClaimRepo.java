package com.example.demo.repo;

import com.example.demo.entity.Claim;
import org.springframework.data.repository.CrudRepository;

public interface ClaimRepo extends CrudRepository<Claim, String> {
}
