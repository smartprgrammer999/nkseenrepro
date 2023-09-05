package com.jpaexample.JpaTest1.carEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Car {
	@Id
	private int carno;
    private long carprice;
	private String carname;
    private String modelno;
    private int shit;
	 
	public Car() {
		super();
		
	}
	public Car(int carno, String carname, long carprice, String modelno,int shit) {
		super();
		this.carno = carno;
		this.carname = carname;
		this.carprice = carprice;
		this.shit = shit;
		this.modelno = modelno;
	}
	public int getCarno() {
		return carno;
	}
	public void setCarno(int carno) {
		this.carno = carno;
	}
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public long getCarprice() {
		return carprice;
	}
	public void setCarprice(long carprice) {
		this.carprice = carprice;
	}
	public int getShitter() {
		return shit;
	}
	public void setShitter(int shit) {
		this.shit = shit;
	}
	public String getModelno() {
		return modelno;
	}
	public void setModelno(String modelno) {
		this.modelno = modelno;
	}
	
@Override
	public String toString() {
		return "Car [carno=" + carno + ", carprice=" + carprice + ", carname=" + carname + ", modelno=" + modelno
				+ ", no's of shit=" + shit + "]";
	}

}
