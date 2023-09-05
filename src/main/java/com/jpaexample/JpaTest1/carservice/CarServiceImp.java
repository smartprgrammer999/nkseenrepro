package com.jpaexample.JpaTest1.carservice;

import java.util.List;

import com.jpaexample.JpaTest1.carEntity.Car;

public interface CarServiceImp {
public List<Car> getCars();
public Car addCar(Car car);
public List<Car> addCarList(List<Car> carlist);
public Car updateCourse(Car car);
public void deleteCar(Integer carno);
public Car getCar(Integer carno);
}
