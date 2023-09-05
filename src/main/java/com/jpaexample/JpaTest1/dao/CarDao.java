package com.jpaexample.JpaTest1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpaexample.JpaTest1.carEntity.Car;

public interface CarDao extends JpaRepository<Car,Integer> {
}