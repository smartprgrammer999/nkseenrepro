package com.jpaexample.JpaTest1.carservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpaexample.JpaTest1.carEntity.Car;
import com.jpaexample.JpaTest1.dao.CarDao;
@Service
public class CarService implements CarServiceImp{
	@Autowired
 private CarDao cardao;
	@Override
	public List<Car> getCars() {
		
		return cardao.findAll();
	
	}

	@Override
	public Car addCar(Car car) {

		return cardao.save(car);
	}

	@Override
	public List<Car> addCarList(List<Car> licar) {
		
		return cardao.saveAll(licar);
	}

	public Car updateCourse(Car car) {
		
		return cardao.save(car);
	}

	 
	@Override
	public void deleteCar(Integer carno) {
		Car var=cardao.getOne(carno);
		 cardao.delete(var);
		
	}
	//@SuppressWarnings("deprecation")
	@Override
	public Car getCar(Integer carno) {
		Car obj=cardao.getOne(carno);
		 
		return obj;	 
	}
	
	 
}
