package com.npci.rest.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Department")
public class Department {

	@Id
	@Column(name = "deptno")
	private Integer deptNo;
	@Column(name = "departmentname")
	private String deptName;
	@Column(name = "location")
	private String location;
	public Department() {
		super();
	}
	public Department(Integer deptNo, String deptName, String location) {
		super();
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.location = location;
	}
	@Override
	public String toString() {
		return "Department [deptNo=" + deptNo + ", deptName=" + deptName + ", location=" + location + "]";
	}
	
}
