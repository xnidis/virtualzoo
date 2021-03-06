package com.virtualzoo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.virtualzoo.models.Animal;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, String> {

}
