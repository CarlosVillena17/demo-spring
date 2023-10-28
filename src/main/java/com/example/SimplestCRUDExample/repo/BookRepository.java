package com.example.SimplestCRUDExample.repo;

import com.example.SimplestCRUDExample.model.Riesgos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Riesgos, Long> {

}
