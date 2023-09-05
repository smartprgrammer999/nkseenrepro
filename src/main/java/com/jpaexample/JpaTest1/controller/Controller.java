package com.jpaexample.JpaTest1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpaexample.JpaTest1.carEntity.Car;
import com.jpaexample.JpaTest1.carservice.CarService;

@RestController
public class Controller {
@Autowired
CarService carservice;
@GetMapping("/name")
public String nameShow()
{
	return "nikesh kumar singh";
}
@GetMapping("/car")
public List<Car> getCars()
{
return this.carservice.getCars();

}
@GetMapping(path="/car/{carno}")
public Car getCar(@PathVariable Integer carno)
{
	Car obj1=this.carservice.getCar(carno);
	System.out.println("nikesh="+obj1);
return obj1;	
}
@PostMapping("/car")
public Car addCar(@RequestBody Car car) 
{
return this.carservice.addCar(car);	
}
@PostMapping("/carlist")
public List<Car> addCarList(@RequestBody List<Car> carlist) 
{
return this.carservice.addCarList(carlist);	
}
@PutMapping("/car")
public Car updateCar(@RequestBody Car car)
{
return this.carservice.updateCourse(car);	
}
@DeleteMapping("/car/{carno}")
public String deleteCar(@PathVariable Integer carno)
{
	
	try
	{
	this.carservice.deleteCar(carno);	
	return "this information has deleted successfully";
	}
	catch(Exception e)
	{
		return "this information can't be exist in record so cant be delete";
	}
	
}

}
