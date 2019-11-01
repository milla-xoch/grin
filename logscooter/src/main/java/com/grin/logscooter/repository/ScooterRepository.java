package com.grin.logscooter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grin.logscooter.entity.Scooter;

public interface ScooterRepository extends JpaRepository<Scooter, Integer> {

}
