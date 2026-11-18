package com.senai.gta6.repository;

import com.senai.gta6.entity.Arma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArmaRepository extends JpaRepository<Arma, Integer> {
}
