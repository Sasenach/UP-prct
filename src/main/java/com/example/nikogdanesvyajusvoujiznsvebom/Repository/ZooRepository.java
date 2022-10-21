package com.example.nikogdanesvyajusvoujiznsvebom.Repository;

import com.example.nikogdanesvyajusvoujiznsvebom.Model.Zoo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ZooRepository extends CrudRepository<Zoo, Long> {
    public List<Zoo> findByNameContaining(String name);
}
